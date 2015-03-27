public class TestRegexListener extends RegularExpressionBaseListener {
	
	private String grupo = "";
	private String identacao = "";
	private String caracteres = "";
	private int nivelIdentacaoAtual = 0;
	private int contadorGruposNumerados = 0;
	
	public String calcularIdentacao (int x) {
		
		String tabulacoes = "";
		
		for (int i=0; i<x; i++){
			tabulacoes += "  ";
		}
		
		return tabulacoes;
	}

	@Override  
	public void enterGroupstart(RegularExpressionParser.GroupstartContext ctx) {
		
		//Pega o texto do contexto atual
		grupo = ctx.getText();
		
		if (grupo.equals("(")) {
			
			contadorGruposNumerados++;
			
			identacao = calcularIdentacao(nivelIdentacaoAtual);
			
			System.out.println(identacao + "Grupo Numerado " + contadorGruposNumerados);
			
			nivelIdentacaoAtual++;
		}
	}
	
	@Override
	public void enterCharacters(RegularExpressionParser.CharactersContext ctx) {
		
		identacao = calcularIdentacao(nivelIdentacaoAtual);
		
		caracteres = ctx.getText();
		
		System.out.println(identacao + caracteres);
	}
	
	@Override
	public void enterGroupend(RegularExpressionParser.GroupendContext ctx) {
		nivelIdentacaoAtual--;		
	}

}
