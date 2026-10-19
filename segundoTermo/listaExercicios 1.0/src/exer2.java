import java.util.Scanner;

public class exer2{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println ("Entre com seu nome: ");
	String nomeUsuario = scanner.nextLine();

	System.out.println ("Entre com sua idade: ");
	int idadeUsuario = scanner.nextInt();

	System.out.println ("Entre com sua altura: ");
	Double alturaUsuario = scanner.nextDouble();

	System.out.println ("Entre com seu peso: ");
	Double pesoUsuario = scanner.nextDouble();

	System.out.println ("Entre com a inicial do seu nome: ");
	char inicialNome = scanner.next().charAt(0);
	
	System.out.println ("Nome: " + nomeUsuario);
	System.out.println ("Idade: " + idadeUsuario);
	System.out.println ("Altura: " + alturaUsuario);
	System.out.println ("Peso: " + pesoUsuario);
	System.out.println ("Imicial: " + inicialNome);


	scanner.close();

    }

}
