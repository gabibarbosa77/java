
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pontuacao = new int[8];
        int soma = 0;
        Double media = 0.0;

        for(int i = 0; i < pontuacao.length; i++){
            System.out.println("Entre com a pontuacao do " + (i+1) + " aluno: ");
            pontuacao[i] = sc.nextInt();

            soma += pontuacao[i];
        }

        for(int a = 0; a < pontuacao.length; a++){
            System.out.println("Pontuacao " + (a +1) + " aluno: " + pontuacao[a]);
        }

        System.out.println("A soma das pontuacoes: " + soma);
        media = (double) soma/ pontuacao.length;
        System.out.println("A media das pontuacoes: " + media);

        sc.close();
    }
}
