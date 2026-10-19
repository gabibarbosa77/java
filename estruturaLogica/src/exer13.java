import java.util.Scanner;

public class exer13 {
    public static void main(System[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor em reais(R$) para converter em dolar(US$): ");
        double real = scanner.nextDouble();

        double dolar = real / 5.40;

        System.out.println("R$" + real + " em dólar(US$1,00 = R$5.40) US$" + dolar);

        scanner.close();
    }

}