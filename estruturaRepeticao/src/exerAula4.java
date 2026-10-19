import java.util.Scanner;

public class exerAula4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador<=5) {
            
            System.out.println("Entre com um número: ");
            int nuns = scanner.nextInt();
            soma = soma + nuns;

            contador++;
        } 

        System.out.println("A soma dos 5 números é: " + soma);

        scanner.close();
    }
}
