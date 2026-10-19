import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = sc.nextInt();

        int fatorial = 1 ;

        if(num>=0){
            while(num != 0){
                fatorial = fatorial * num;
                num--;
            }
            System.out.println("O fatorial do número inserido é " + fatorial);
        }else{
            System.out.println("Número inválido para realização do cálculoa!");
        }
    }
}
