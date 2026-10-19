import java.util.Scanner;

public class exerAula6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        double saldo = 0;

        while(opcao != 4){
            System.out.println("1 Consultar saldo");
            System.out.println("2 Depositar");
            System.out.println("3 Sacar");
            System.out.println("4 Sair");

            System.out.println("Escolha uma opcao(ex; 1): ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("============= Seu saldo é " + saldo + "=================");
            }else if(opcao == 2){
                System.out.println("Entre com o valor que deseja depositar: ");
                double deposito = scanner.nextDouble();
                if(deposito<0){
                    System.out.println("Impossível depositar valor negativo, tente novamente!");
                }else{
                    saldo = saldo + deposito;
                }
            }else if (opcao==3){
                System.out.println("Entre com o valor que deseja sacar: ");
                double saque = scanner.nextDouble();

                if(saque>saldo){
                    System.out.println("Saldo insuficiente, tente novamente!");
                }else if(saque<0){
                    System.out.println("Impossivel saques de valor negativo, tente novamente!");
                }else{
                    saldo = saldo - saque;
                }
            } else{
                System.out.println("Saindo!");
            }
        }

        scanner.close();
    }
}
