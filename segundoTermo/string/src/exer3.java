import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        int vogais = 0;

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if("a".indexOf(letra)>= 0){
                vogais++;
            }
        }

        System.out.println("Quantidade de letras A: " + vogais);

        sc.close();
    }
}
