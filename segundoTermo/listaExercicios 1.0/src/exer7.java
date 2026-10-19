import java.util.Scanner;;
public class exer7{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");
        int raio = scanner.nextInt();

        double pi = Math.PI;

        double area = pi * (raio * raio);

        System.out.println("A area do circulo e " + area);

        scanner.close();
    }
}