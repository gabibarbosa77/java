import java.util.Scanner;

public class exem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num1 = scanner.nextInt();

        int resto = num1 % 2;

        if ( resto == 0 ){
            System.out.println("Numero par!");
        } else{
            System.out.println("Numero impar!");
        }
    }
    
}
