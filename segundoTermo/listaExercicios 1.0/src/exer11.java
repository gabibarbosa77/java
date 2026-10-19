import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Entre com um número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subt = num1 - num2;
        int mult = num1 * num2;
        double divi = num1 / num2;

        System.out.println("---------- RESULTADO PERACOES -------------");
        System.out.println("Soma:" + soma);
        System.out.println("Subtracao:" + subt);
        System.out.println("Multiplicacao:" + mult);
        System.out.println("Divisao:" + divi);

        scanner.close();

    }

}