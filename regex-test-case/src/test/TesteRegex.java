package test;

import java.io.IOException;

import test.parseTree.TestRegexPerl;
import test.parseTree.TestRegexPosix;

public class TesteRegex {
	
	public static void main(String[] args) throws IOException {
		
		if (args.length > 0){
			
			String modo = args[0];
			String opcao = null;
			
			if (args.length > 1) {
				opcao = args[1];
				
				if (!opcao.equals("-gui") && !opcao.equals("-list")){
					System.out.println("Argumento de visualizacao incorreto.");
					System.out.println("Utilizae -gui ou -list");
					return;
				}
			}
				
			if (modo.equals("-posix"))
				new TestRegexPosix(opcao);
			
			else if (modo.equals("-perl"))
				new TestRegexPerl(opcao);
			
			else {
				System.out.println("Argumento de execucao incorreto.");
				System.out.println("Utilize -posix ou -perl");
			}
		}
		
		else {
			System.out.println("Faltou argumento de execucao.");
			System.out.println("Utilize -posix ou -perl");
		}
		
		
	}
}
