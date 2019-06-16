/*
 * Projeto Calcula Estoque de Produtos.
 */
package calculadoradeestoque;

/**
 *
 * @author Dieisson Martins
 */
public class CalculadoraDeEstoque{

	public static void main(String[] args){

		/*numero com ponto flutuate*/
		double livroJava8;
		double livroTDD;

		livroJava8 	= 59.90;
		livroTDD 	= 59.90;

		double soma = livroJava8 + livroTDD;

		System.out.println("O Total de Estoque é "+soma); 
	}
}