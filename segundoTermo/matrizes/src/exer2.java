import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][4];
        int numMaior = 0;

        for(int i = 0; i <  matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if(i == 0 && j == 0){
                    numMaior = matriz[i][j];
                }else if(matriz[i][j] > numMaior){
                        numMaior = matriz[i][j];
                    }
            }
        }

        System.out.println("O maior número da matriz é: " + numMaior);

        sc.close();
    }
}
