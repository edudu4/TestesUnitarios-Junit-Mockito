package exemplo.retangulo;

public class Retangulo {
	
	private int base;
	private int altura;
	
	
	public Retangulo (int base, int altura) {
	
		this.base = base;
		this.altura = altura;
	
	}
	
	
	public int calcArea () {
		
		int area = base*altura;
		
		return area;
		
	}
	
	
	public int calcPerimetro () {
		
		int perimetro = 2*base + 2*altura + 1;
		
		return perimetro;
		
	}
	
	
}
