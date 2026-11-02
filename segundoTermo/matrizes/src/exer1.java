import java.util.Scanner;

public class exer1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Entre com o valor [" + i +"]["+ j +"]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma final da matriz: " + soma);

        sc.close();
    }
}