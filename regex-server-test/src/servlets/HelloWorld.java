package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import teste.Regex;
import teste.Traducao;

@SuppressWarnings("serial")
public class HelloWorld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recupera o valor digitado pelo usuario
		String input = request.getParameter("regex");
		
		//Instancia a classe responsavel em fazer a traducao, passando
		//para ela o valor recebido do formulario
		Regex regex = new Regex(input);
		
		//Traduz a expressao inserida, gerando um objeto
		//do tipo Traducao.
		Traducao traducao = regex.traduzir();
		
		//Define o tipo de resposta para html
		response.setContentType("text/html");
		
		//Cria um 'escritor' para adcionar conteudo na resposta
		PrintWriter out = response.getWriter();
		
		//Verifica se ocorreram erros
		if (traducao.ocorreuErro()) {
			
			//Coloca uma mensagem de erro na resposta
			out.println("<p>A expressao não está correta</p>");
		}
		
		//Se nao ocorreram erros
		else {
			
			//Recupera a traducao em forma de listas nao ordenadas,
			//utilizando o metodo getTextHTML() do objeto Traducao,
			//e insere estas listas na resposta
			
			//TODO traducao para HTML ainda nao esta completa
			//out.println(traducao.getTextHTML());
			
			
			//Recupera a traducao em texto puro, com quebras
			//de linha e identacoes usando espacos, e adciona ela
			//dentro de uma tag textarea na resposta
			out.println("<textarea>");
			out.println(traducao.getText());
			out.println("</textarea>");
		}
	}

}
