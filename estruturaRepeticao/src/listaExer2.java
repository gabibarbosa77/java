import java.util.Scanner;

public class listaExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número (inteiro e positivo): ");
        int num = scanner.nextInt();

        int soma = 0;

        while(num>= 0 ){
            soma = soma + num;
            num--;
        }

        System.out.println("A soma do fatorial desse número é: " + soma);

        scanner.close();
    }   
}
