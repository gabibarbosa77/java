import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor total da compra: ");
        Double valCompra = sc.nextDouble();

        double desconto = 0.0;

        if (valCompra >= 500.00) {
            desconto = 0.1;
        } else {
            desconto = 0.05;
        }

        double descontoCompra = descontoCompra(valCompra, desconto);
        double precoFinal = valorFinal(valCompra, descontoCompra);

        System.out.println("Desconto aplicado: R$" + descontoCompra);
        System.out.println("Valor final: R$" + precoFinal);

        sc.close();
    }

    public static double descontoCompra(double valCompra, double desconto) {
        return (valCompra * desconto);
    }

    public static double valorFinal(double valCompra, double descontoCompra) {
        return (valCompra - descontoCompra);
    }
}
