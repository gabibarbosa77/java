import java.util.Scanner;

public class listaExer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número (inteiro e positivo): ");
        int num = scanner.nextInt();

        int fatorial = 1;

        while(num>= 1 ){
            fatorial = fatorial * num;
            num--;
        }

        System.out.println("O fatorial desse número é: " + fatorial);

        scanner.close();
    }   
}
