package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import test.parseTree.TestRegexERE;

//TODO Modo PCRE desativado 
//import test.parseTree.TestRegexPCRE;

public class TesteRegex {
	
	/** 
	 * Usuario digita pela entrada de texto padrao uma expressao regular,
	 * seguido de uma quebra de linha. Como resultado,
	 * e imprimido na tela uma versao em estrutura de arvore e linguagem natural da
	 * expressao. Opcionalmente pode ser exibida uma representacao da parse tree gerada.<br>
	 * @param args Uma lista de argumentos String[]<br>
	 * <br>
	 * Obrigatoriamente deve ser passado um argumento de modo de execucao, e opcionalmente um
	 * argumento de modo de visualizacao.<br>
	 * <br>
	 * Dos argumentos de modo de execucao:<br>
	 * &nbsp;&nbsp; "-posix" executa em modo de compatibilidade POSIX ERE;<br>
	 * &nbsp;&nbsp; "-pcre" executa em modo de compatibilidade PCRE;<br>
	 * <br>
	 * Dos argumentos de visualizacao:<br>
	 * &nbsp;&nbsp; "-gui" exibe uma representacao grafica da parse tree gerada;<br>
	 * &nbsp;&nbsp; "-list" exibe a parse tree em forma de lista;<br>
	 * <br>
	 * @throws IOException A execucao depende da existencia de arquivos de texto com as
	 * definicoes dos tokens. */
	public static void main(String[] args) throws IOException {
		
		//Se foi passado algum argumento
		if (args.length > 0){
			
			String modo = args[0]; //Salva o 1o argumento
			String opcao = "";
			
			//Se foram passados pelo menos dois argumentos
			if (args.length > 1) {
				
				opcao = args[1]; //Salva o 2o argumento
				
				//Mensagem de erro caso o 2o argumento esteja errado
				if (!opcao.equals("-gui") && !opcao.equals("-list")){
					System.out.println("");
					System.out.println("Argumento de visualizacao incorreto.");
					System.out.println("Utilizae -gui ou -list");
					System.out.println("");
					return;
				}
			}
			
			//Mensagem de erro caso o 1o argumento esteja errado
			if (!modo.equals("-posix") && !modo.equals("-pcre")) {
				System.out.println("");
				System.out.println("Argumento de execucao incorreto.");
				System.out.println("Utilize -posix ou -pcre");
				System.out.println("");
			}
			else {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String input = br.readLine();
				
				//Executa em modo POSIX ERE
				if (modo.equals("-posix"))
					new TestRegexERE(input, opcao);
				
				//TODO Modo PCRE desativado 
				else if (modo.equals("-pcre"))
					System.out.println("Modo PCRE temporariamente desativado, utilize POSIX.");
				
/*				//Executa em modo PCRE
				else if (modo.equals("-pcre"))
					new TestRegexPCRE(input, opcao);*/
			}
		}
		
		//Mensagem de erro caso nao existam argumentos
		else {
			System.out.println("");
			System.out.println("Faltou argumento de execucao.");
			System.out.println("Utilize -posix ou -pcre");
			System.out.println("");
		}
	}
}
