package exemplo.retangulo;

public class TestesMain {

	public static void main(String[] args) {
		
		CalculadoraTest testeCalculadora = new CalculadoraTest();
		RetanguloTest testeRetangulo = new RetanguloTest();
		
		
		System.out.println("Teste Calculadora: " + testeCalculadora.testarSoma());
		
		
		System.out.println("Teste Área: " + testeRetangulo.testArea());
		System.out.println("Teste Perimetro: " + testeRetangulo.testPerimetro());
		
		
		
	}
	
}
