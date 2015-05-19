package teste.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import regex.Regex;

/**
 * Testes JUnit para a classe Regex. Testa se o algoritimo identifica
 * corretamente expressoes corretas e erradas.
 * 
 * @author Tiso
 *
 */
public class RegexTestValid {
	
	boolean erro;
	private Regex teste;
	
	private String[] expressoesCorretas = {
			"abc(def(hij))lm+",
			"[a-z]*gf+[*=]",
			"[---]",
			"(f){2,4}",
			"digit[[:digit:]+]+",
			"\\+{5}",
			"\\\\"
			};
	
	private String[] expressoesErradas = {
			"a++",
			"abc(",
			"(abc",
			"[z-a]",
			"r{9001,0}",
			"[:digit:]",
			"[[:bla:]]",
			"[-----]",
			"[[:+:]]",
			"\\"
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
		
		System.out.println();
		
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
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		teste = null;
	}

}
