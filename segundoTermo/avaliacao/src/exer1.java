import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da compra: ");
        Double valCompra = sc.nextDouble();

        System.out.println("FORMA DE PAGAMENTO ");
        System.out.println("1 - A VISTA ");
        System.out.println("2 - PARCELADO ");

        System.out.println("Escolha uma forma: ");
        int formaPagamento = sc.nextInt();

        if (valCompra >= 200.00 && formaPagamento == 1) {
            Double desconto = valCompra * 0.10;
            Double valFinal = valCompra - desconto;

            System.out.println("Desconto: " + desconto);
            System.out.println("Valor final: " + valFinal);
        } else {
            System.out.println("Compra não tem direito a desconto!");
            System.out.println("Valor final: " + valCompra);
        }

        sc.close();
    }
}