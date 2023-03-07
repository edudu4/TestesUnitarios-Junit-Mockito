package exemplo.retangulo;

public class RetanguloTest {
	
	
	Retangulo retangulo;
	
	public boolean testArea() {
		
		retangulo = new Retangulo(2,5);
		int resultadoEsperado = 10;
		
		if(resultadoEsperado == retangulo.calcArea()) {
			
			return true;
			
		} else {
			
			return false;
		
		}
		
	}
	
	public boolean testPerimetro() {
		
		retangulo = new Retangulo(5,10);
		int resultadoEsperado = 30;
		
		if(resultadoEsperado == retangulo.calcPerimetro()) {
			
			return true;
	
		} else {
			
			return false;
		
		}
	
	}
	

}
