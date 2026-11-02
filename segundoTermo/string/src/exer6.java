import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        boolean palindromo = true;

        for(int i = 0; i < palavra.length() / 2; i++){
            if(palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)){
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("A palavra é um palíndromo!");
        } else {
            System.out.println("A palavra não é um palíndromo!");
        }

        sc.close();
    }
}
