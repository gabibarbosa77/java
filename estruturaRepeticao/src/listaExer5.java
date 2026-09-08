import java.util.Scanner;

public class listaExer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha=0;
        
        do {
            System.out.println("Entre com a senha:");
            senha = scanner.nextInt();
        } while(senha != 1234);

        System.err.println("Acesso liberado, senha correta!");

        scanner.close();
    }
}
