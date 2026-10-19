import java.util.Scanner;

public class exer3{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println ("Entre com o nome do produto: ");
	String nomeProduto = scanner.nextLine();

	System.out.println ("Entre com o codigo do produto: ");
	int codigoProduto = scanner.nextInt();

	System.out.println ("Entre com o preco do produto: ");
	Double precoProduto = scanner.nextDouble();

	System.out.println ("Entre com o estoque do produto: ");
	int estoqueProduto = scanner.nextInt();

	System.out.println ("Produto: " + nomeProduto);
	System.out.println ("Codigo: " + codigoProduto);
	System.out.println ("Preco: " + precoProduto);
	System.out.println ("Estoque: " + estoqueProduto);
	
	scanner.close();

	}
}