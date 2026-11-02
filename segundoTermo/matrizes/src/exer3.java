import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[4][2];

        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                System.out.println("Entre com a nota [" + i + "][" + j + "]: ");
                notas[i][j] = sc.nextDouble();


            }
        }

        for(int i = 0; i < notas.length; i++){
            double media  = (notas[i][0] + notas[i][1]) / 2;

            System.out.println("Media aluno " + (i+1) + ": " + media);

            if(media >= 6.0){
                System.out.println("Média maior que 6.0!");
            }else{
                System.out.println("Media menor que 6.0!");
            }
        }
        
        sc.close();
    }
}
