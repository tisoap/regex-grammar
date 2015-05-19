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
 * Testes JUnit para a classe Regex.
 * 
 * @author Tiso
 *
 */
@RunWith(Theories.class)
public class RegexTestTime {
	
	private Regex teste;
	private long startTime, stopTime, elapsedTime;
	
   @DataPoints
   public static String[] strings = {
	   "a", //1
	   "aa", //2
	   "aaaa", //4
	   "aaaaaaaa", //8
	   "aaaaaaaaaaaaaaaa", //16
	   "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" //32
	   };
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		teste = new Regex();
	}
	
	/**
	 * Metodo de teste para {@link regex.Regex#traduzir()}.<br>
	 * Testa apenas timeout.
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
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		teste = null;
	}

}
