import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha; 

        do { 
            System.out.println("Entre com a senha: ");
            senha = sc.nextInt();
        } while (senha != 1234);

        System.out.println("Acesso permitido!");
    }
}
