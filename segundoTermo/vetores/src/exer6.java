
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        for(int i = 0; i < num.length; i++){
            System.out.print("Entre com numeros " + (i+1) + " :");
            num[i] = sc.nextInt();
        }

    }
}
