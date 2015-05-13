package teste.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import regex.Regex;

/**
 * Testes JUnit para a classe Regex.
 * 
 * @author Tiso
 *
 */
public class RegexTest {
	
	boolean erro;
	private Regex teste;
	private String expressao = "a|b";
	
	private String[] expressoesErradas = {
			"a++",
			"[z-a]",
			"r{9001,0}",
			"[:bla:]",
			"[-----]"
			};
	
	private String[] expressoesCorretas = {
			"abc(def(hij))lm+",
			"[a-z]*gf+[*=]",
			"[---]",
			"(f){2,4}",
			"digit[:digit:]"
			};
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		teste = new Regex();
	}

	/**
	 * Metodo de teste para {@link regex.Regex#validar()}.
	 */
	@Test
	public void testValidar() {	
		
		System.out.println("Testando expressoes corretas:");
		for (String string : expressoesCorretas) {
			System.out.println(string);
			
			teste.setRegularExpresion(string);
			
			try {
				teste.inicializar();
			} catch (IOException e) {
				fail("Erro de IO.");
			}
			
			erro = teste.validar();
			assertTrue("Essa expressao e correta",erro);
		}
		
		System.out.println("");
		
		System.out.println("Testando expressoes erradas:");
		for (String string : expressoesErradas) {
			System.out.println(string);
			
			teste.setRegularExpresion(string);
			
			try {
				teste.inicializar();
			} catch (IOException e) {
				fail("Erro de IO.");
			}
			
			erro = teste.validar();
			assertFalse("Esta expressao e errada.",erro);
		}
	}
	
	/**
	 * Metodo de teste para {@link regex.Regex#traduzir()}.<br>
	 * Testa apenas timeout.
	 */
	@Test(timeout=200)
	public void testTraduzir(){
		
		try {
			teste = new Regex(expressao);
		} catch (IOException e) {
			fail("Erro de IO.");
		}
		
		teste.traduzir();
		
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		teste = null;
	}

}
