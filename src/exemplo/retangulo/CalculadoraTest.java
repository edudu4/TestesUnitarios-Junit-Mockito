package exemplo.retangulo;

public class CalculadoraTest {
	
	
	public String testarSoma () {
		
		Calculadora calc = new Calculadora();
		
		int resultadoEsperado = 7;
		
		
		int resultado = calc.somar(2, 5);
		
		if (resultado == resultadoEsperado) {
			
			return "Ok!";
			
		} else {
			
			return "Resultado Falhou!";
			
		}
		
	}
	

}
