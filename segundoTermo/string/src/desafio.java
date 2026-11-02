import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma frase: ");
        String frase = sc.nextLine().toLowerCase();

        if(frase.equals("java")){
            System.out.println("A frase contem a palavra JAVA!");
        }else{
            System.out.println("A frase nao contem a palavra JAVA!");
        }

        int vogais = 0;
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if("aeiou".indexOf(letra) >= 0){
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);

        int caracteres = frase.length();
        int espacos = 0;

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                espacos++;
            }
        }

        System.out.println("Caracteres: " + (caracteres - espacos));
        System.out.println("Espaços vazios: " + espacos);

        sc.close();
    }
}
