import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Entre com o preco produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.println("Entre com a quantidade: ");
        int quantProduto = scanner.nextInt();

        double valorTotal = precoProduto * quantProduto;

        System.out.println("-------RESUMO COMPRA----------");
        System.out.println("Nome produto: " + nomeProduto);
        System.out.println("Preco produto: " + precoProduto);
        System.out.println("Quantidade produto: " + quantProduto);
        System.out.println("PRECO FINAL: " + valorTotal);

        scanner.close();
    }
}