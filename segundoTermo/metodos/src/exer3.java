import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {

        double saldoInicial = 1000.00;
        int opcao = 0;

        Scanner sc = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("======== OPERACOES =======");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");

            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                consultarSaldo(saldoInicial);

            } else if (opcao == 2) {

                System.out.println("Qual valor deseja sacar?");
                double saque = sc.nextDouble();

                saldoInicial = sacar(saldoInicial, saque);

            } else if (opcao == 3) {

                System.out.println("Qual valor deseja depositar?");
                double deposito = sc.nextDouble();

                saldoInicial = depositar(saldoInicial, deposito);

            } else if (opcao == 4) {

                System.out.println("Encerrando o caixa eletrônico...");

            } else {

                System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }

    public static void consultarSaldo(double saldoInicial) {
        System.out.println("Seu saldo é: R$" + saldoInicial);
    }

    public static double sacar(double saldo, double valor) {

        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            saldo = saldo - valor;
            System.out.printf("Saque realizado! Saldo atual: R$" + saldo);
        }

        return saldo;
    }

    public static double depositar(double saldo, double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo!");
        } else {
            saldo = saldo + valor;
            System.out.printf("Depósito realizado! Saldo atual: R$" + saldo);
        }
        return saldo;
    }
}