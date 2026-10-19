import java.util.Scanner;

public class exer8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com uma temperatura (°C): ");
        int temperaturaCelsius = scanner.nextInt();

        double temperaturaFah = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("A temperatura " + temperaturaCelsius + " °C em fahrenheit " + temperaturaFah);

        scanner.close();
    }
    
}