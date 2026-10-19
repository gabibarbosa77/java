import java.util.Scanner;

public class exem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num1 = scanner.nextInt();

        if(num1 > 0 ){
            System.out.println("Numero positivo!");
        } else if(num1 < 0 ){
            System.out.println("Numero negativo!");
        } else{
            System.out.println("Numero é 0!");
        }

        scanner.close();
        
    }
}
