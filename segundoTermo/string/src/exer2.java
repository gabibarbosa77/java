import java.util.Scanner;

public class exer2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com seu email: ");
        String email = sc.nextLine();

        if(email.contains("@")){
            if(email.endsWith(".com")){
                System.out.println("Email válido!");
            }else{
                System.out.println("Email inválido! Não contém .com!");
            }
        }else{
            System.out.println("Email inválido!");
        }
        sc.close();
    }
}
