import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o curso do aluno: ");
        String cursoAluno = scanner.nextLine();

        System.out.println("Entre com o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Entre com a idade do aluno: ");
        int idadeAluno = scanner.nextInt();

        System.out.println("Entre com o termo do aluno: ");
        int termoAluno = scanner.nextInt();

        System.out.println("nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("-------------------------");
        System.out.println("DADOS DO ALUNO");
        System.out.println("-------------------------");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("Curso: " + cursoAluno);
        System.out.println("Termo: " + termoAluno + "°");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Media: " + media);

        scanner.close();
    }

}
