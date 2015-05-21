package teste.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import regex.Regex;
import regex.Traducao;

/**
 * @author Tiso
 *
 */
public class TradutorTest {
	
	private Regex teste;
	private Traducao traducao;
	
	private String[] regex = {
			"a|b",
			"(a)",
			"^a$",
			"a+",
			"a*",
			"a?",
			"a{1}",
			"a{1}",
			"a{1,2}",
			"[^a]",
			"[a]",
			"[---]",
			"[a-z]",
			"[[:digit:]]",
			"[[:space:]]",
			"[[:alnum:]]",
			"[[:alpha:]]",
			"[[:blank:]]",
			"[[:cntrl:]]",
			"[[:graph:]]",
			"[[:lower:]]",
			"[[:print:]]",
			"[[:punct:]]",
			"[[:upper:]]",
			"[[:xdigit:]]",
			".",
			"abc"
			};
	
	private String[] traducoes = {
			"Uma das opções:\n   Opção 1:\n      Caracteres: a\n   Opção 2:\n      Caracteres: b\n",
			"Grupo 1:\n   Caracteres: a\n",
			"No início do texto\nCaracteres: a\nNo final do texto\n",
			"Um ou mais:\n   a\n",
			"Zero ou mais:\n   a\n",
			"Pode ou não conter:\n   a\n",
			"Exatamente 1 ocorrências de:\n   a\n",
			"Exatamente 1 ocorrências de:\n   a\n",
			"Entre 1 e 2 ocorrencias de:\n   a\n",
			"Qualquer caractere que não seja:\n   a\n",
			"Qualquer um dos caracteres:\n   a\n",
			"Qualquer um dos caracteres:\n   Todos os caracteres entre '-' e '-'\n",
			"Qualquer um dos caracteres:\n   Todos os caracteres entre 'a' e 'z'\n",
			"Qualquer um dos caracteres:\n   Dígitos\n",
			"Qualquer um dos caracteres:\n   Caracteres brancos\n",
			"Qualquer um dos caracteres:\n   Caracteres alfanuméricos\n",
			"Qualquer um dos caracteres:\n   Caracteres alfabéticos\n",
			"Qualquer um dos caracteres:\n   Espaço e tabulação\n",
			"Qualquer um dos caracteres:\n   Caracteres de controle\n",
			"Qualquer um dos caracteres:\n   Caracteres visíveis\n",
			"Qualquer um dos caracteres:\n   Letras minúsculas\n",
			"Qualquer um dos caracteres:\n   Caracteres visíveis e espaço\n",
			"Qualquer um dos caracteres:\n   Caracteres de pontuação\n",
			"Qualquer um dos caracteres:\n   Letras maiúsculas\n",
			"Qualquer um dos caracteres:\n   Números hexadecimais\n",
			"Qualquer caractere\n",
			"Caracteres: abc\n"
			};

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		traducao = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		teste = null;
	}

	/**
	 * Test method for {@link regex.Tradutor#traduzir(gerado.RegularExpressionEREParser.ExpressionContext)}.
	 */
	@Test
	public void testTraduzir() {
		
		for (int i = 0; i<regex.length; i++) {
			
			try {
				teste = new Regex(regex[i]);
			} catch (IOException e) {
				fail("Erro de IO.");
			}
			
			traducao = teste.traduzir();
			
			assertEquals(
					"As traducoes devem ser iguais.",
					traducoes[i],
					traducao.getText()
					);
			
			//System.out.println(traducao.getText());
		}
		
		
	}

}
