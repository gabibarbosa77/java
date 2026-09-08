import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1° nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("2° nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("3° nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("------------ MEDIA FINAL -------------");

        System.out.println("nota 1: " + nota1);
        System.out.println("nota 2: " + nota2);
        System.out.println("nota 3: " + nota3);
        System.out.println("Media Final: " + media);

        scanner.close();

    }

}