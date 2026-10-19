import java.util.Scanner;

public class exer4{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Nome aluno:");
	String nome = scanner.nextLine();

	System.out.println("Curso aluno: ");
	String curso = scanner.nextLine();

	System.out.println("Termo Aluno: ");
	int termo = scanner.nextInt();

	System.out.println("Nota 1: ");
	Double nota1 = scanner.nextDouble();

	System.out.println("Nota 2: ");
	Double nota2 = scanner.nextDouble();


	System.out.println("Nome: " + nome);
	System.out.println("Curso: " + curso);
	System.out.println("Termo: " + termo);
	System.out.println("Nota 1: " + nota1);
	System.out.println("Noat 2: " + nota2);

    scanner.close();

	}

}