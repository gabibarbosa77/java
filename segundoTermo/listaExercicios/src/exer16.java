import java.util.Scanner;

public class exer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o preco do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Entre com o percentual de desconto (ex: 10): ");
        int desconto = scanner.nextInt();

        double desconto2 = (desconto / 100.0) * precoProduto;
        double valorTotal = precoProduto - desconto2;

        System.out.println("Valor do produto com desconto: " + valorTotal);

        scanner.close();
    }
}