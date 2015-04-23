package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/** 
	 * Usuario digita pelo console uma expressao regular,
	 * seguido de uma quebra de linha. Como resultado,
	 * e imprimido na tela uma versao em estrutura de arvore e linguagem natural da
	 * expressao. Opcionalmente pode ser exibida uma representacao da parse tree gerada.<br>
	 * @param args Uma lista de argumentos String[]<br>
	 * <br>
	 * Opcionalmente pode ser passado um argumento de modo de visualizacao.<br>
	 * <br>
	 * Dos argumentos de visualizacao:<br>
	 * &nbsp;&nbsp; "-gui" exibe uma representacao grafica da parse tree gerada;<br>
	 * &nbsp;&nbsp; "-list" exibe a parse tree em forma de lista;<br>
	 * <br>
	 * @throws IOException A execucao depende da existencia de arquivos de texto com as
	 * definicoes dos tokens.
	 * 
	 * @author Tiso
	 */
	public static void main(String[] args) throws IOException {
		
		String opcao = "";
		
		//Se foi passado algum argumento
		if (args.length > 0) {
			
			//Armazena o argumento
			opcao = args[0];
			
			//Se o argumento nao for -gui ou -list, exibe uma mensagem de erro e sai
			if (!opcao.equals("-gui") && !opcao.equals("-list")){
				System.out.println("Argumento de visualizacao invalido, utilize -gui ou -list.");
				return;
			}
		}
		
		//Cria um leitor que le a entrada padrao, no caso o console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Leia a entrada ate a primeira quebra de linha e salve em uma String
		String input = br.readLine();
		
		//Fecha o leitor
		br.close();
		
		//Envia o texto recebido para a classe Regex
		Regex regex = new Regex(input);
		
		
		try {
			
			//Tenta validar o texto
			regex.validar();
			
		} catch (Exception e) {
			
			//Se o texto nao for uma expressao valida,
			//exibe uma mensagem de erro e sai
			
			System.err.println("A expressao regular nao e valida.");
			return;
		}
		
		//Se foi passado o parametro '-gui'
		if (opcao.equals("-gui"))
			//Exibe a parse tree em uma janela
			regex.parserTreeGui();
		
		//Se foi passado o parametro '-list'
		else if (opcao.equals("-list"))
			//Imprime a parse tree no console
			regex.parseTreeList();
		
		//Se nenhum parametro foi passado
		else
			//Traduz a expressao para linguagem natural
			regex.traduzir();
	}
}
