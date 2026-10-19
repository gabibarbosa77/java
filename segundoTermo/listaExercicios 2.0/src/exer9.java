import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for(int i = 0; i < num.length;i++){
            System.out.println( i+1 + " numero: ");
            num[i] = sc.nextInt();
        }

        for(int contador = 0; contador< num.length; contador++){
            System.out.println("Posicao " + contador + ": " + num[contador]);
        }
    }
}
