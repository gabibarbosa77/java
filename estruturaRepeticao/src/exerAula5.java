import java.util.Scanner;

public class exerAula5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador<=5) {
            
            System.out.println("Entre com uma nota: ");
            int nota = scanner.nextInt();
            soma = soma + nota;

            contador++;
        } 

        double media = soma / 5;

        System.out.println("A média a partir das 5 notas é: " + media);

        scanner.close();
    }
}
