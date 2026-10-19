import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int abastecimentos = 0;
        int gasolina = 0;
        int superior =0;

        do{
            System.out.println("Entre com a quantidade de gasolina(L): ");
            quantidade = sc.nextInt();

            abastecimentos += 1;
            gasolina += quantidade;

            if(quantidade > 40){
                superior += 1;
            }
            
        }while(quantidade > 0);

        System.out.println("Abastecimentos: " + abastecimentos);
        System.out.println("Total litros: " + gasolina);
        System.out.println("Abastecimentos superior a 40L: " + superior);

        sc.close();
    }
}
