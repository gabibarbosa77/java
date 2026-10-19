import java.util.Scanner;

public class exer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor total da conta: ");
        double valorConta = scanner.nextDouble();

        System.out.println("Entre com a quantidade de pessoas que vão pagar: ");
        int quantPessoas = scanner.nextInt();

        double cadaPessoa = valorConta / quantPessoas;

        System.out.println("Cada pessoa vai pagar R$" + cadaPessoa);

        scanner.close();
    }
}