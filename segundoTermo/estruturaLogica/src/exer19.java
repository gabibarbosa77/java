import java.util.Scanner;

public class exer19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Percentual de desconto: ");
        double percentualDesconto = scanner.nextDouble();

        System.out.print("Percentual de vale/alimentação: ");
        double percentualVale = scanner.nextDouble();

        double desconto = salarioBruto * (percentualDesconto / 100.0);
        double vale = salarioBruto * (percentualVale / 100.0);

        double salarioLiquido = salarioBruto - desconto - vale;

        System.out.println("\nFuncionário: " + nome);
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Vale/alimentação: R$ " + vale);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}