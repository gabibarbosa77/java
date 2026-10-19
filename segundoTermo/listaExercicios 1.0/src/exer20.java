import java.util.Scanner;

public class exer20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        double total = preco * quantidade;
        double desconto = total * percentualDesconto / 100;
        double valorFinal = total - desconto;

        System.out.println("\n===== RESUMO DA VENDA =====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}