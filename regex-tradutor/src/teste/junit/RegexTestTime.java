package teste.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import regex.Regex;

/**
 * Teste JUnit para a classe Regex. Testa o tempo de execucao para a traducao
 * de diferentes expressoes regulares.<br>
 * <br>
 * Utiliza a anotacao RunWith(Theories), que permite que o teste seja executado
 * para cada item de uma colecao de dados finita.<br>
 * <br>
 * http://junit.org/apidocs/org/junit/experimental/theories/Theories.html
 * 
 * @author Tiso
 *
 */
@RunWith(Theories.class)
public class RegexTestTime {
	
	private Regex teste;
	private long startTime, stopTime, elapsedTime;
	
	/** Colecao de dados (expressoes) que serao utilizadas nos testes. */
   @DataPoints
   public static String[] strings = {
	   
	   //Diferentes quantidades do caractere 'a'
	   "a",									//  1
	   "aa",								//  2
	   "aaaa",								//  4
	   "aaaaaaaa",							//  8
	   "aaaaaaaaaaaaaaaa",					// 16
	   "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",	// 32
	   };
	
	/**
	 * Executa antes da execucao de cada teste.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		teste = new Regex();
	}
	
	/**
	 * Metodo de teste para {@link regex.Regex#traduzir()}.<br>
	 * <br>
	 * Testa o tempo de execucao da traducao de uma exprecao.
	 * Vai utilizar qualquer variavel marcada como @DataPoints 
	 * para os testes.
	 */
	@Theory
	public void testTraduzir(String expressao){
		
		System.out.println("Testando tempo da expressao:");
		System.out.println(expressao);
		
		try {
			teste = new Regex(expressao);
		} catch (IOException e) {
			fail("Erro de IO.");
		}
		
		startTime = System.currentTimeMillis();
		
		teste.traduzir();
		
		stopTime = System.currentTimeMillis();
		
		elapsedTime = stopTime - startTime;
		
		System.out.println("Levou " + elapsedTime + " milisegundos");
		System.out.println();
	}
	
	/**
	 * Executa depois da execucao de cada teste.
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		teste = null;
	}

}
