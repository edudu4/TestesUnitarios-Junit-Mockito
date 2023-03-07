package exemplo.pilha;

public class TestesMain {

	public static void main(String[] args) {
		PilhaLivrosTest pilhatest = new PilhaLivrosTest();
		boolean resultado;
		
		resultado = pilhatest.testListaUltimoLivro();
		System.out.println("Teste Lista Ultimo Livro: " + resultado);
		
		resultado = pilhatest.testNaoAdicionaLivroAlemLimite();
		System.out.println("Teste Nao Adiciona Livro Alem do Limite: " + resultado);
		
		resultado = pilhatest.testNaoAdicionaLivroForaPadraoNome();
		System.out.println("Teste Nao Adiciona Livro Fora do Padrao de Nome: " + resultado);
		
		
	}
	
}
