import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Entre com um nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Entre com um nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Entre com um nota: ");
        int nota3 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("--------BOLETIM-------");
        System.out.println("Nome Aluno: " + nomeAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Media Final: " + media);

        scanner.close();
    }

}