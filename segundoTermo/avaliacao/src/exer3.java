import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bicicletas = 10;
        int opcao = 0;

        do{
        System.out.println("SISTEMA LOCACAO");
        System.out.println("1 - Alugar bicicleta");
        System.out.println("2 - Devolver bicicleta");
        System.out.println("3 - Consultar bicicletas disponiveis");
        System.out.println("4 - Encerrar");

        System.out.println("Escolha um opcao: ");
        opcao = sc.nextInt();
        
        if(opcao == 1){
            if(bicicletas > 0){
            bicicletas -=1;
            System.out.println("Bicicleta locada com sucesso!");
            }else{
                System.out.println("Sem bicicletas disponiveis para locacao!");
            }
        }else if(opcao == 2){
            if(bicicletas < 10){
                bicicletas += 1;
                System.out.println("Devolucao concluida com sucesso!");
            }else{
                System.out.println("Devolucao indisponivel!");
            }
        }else if(opcao == 3){
            System.out.println("Quantidade disponivel: " + bicicletas);
        }else{
            System.out.println("Opcao invalida! Tente novamente!");
        }

        }while(opcao != 4);
        
        sc.close();
    }
}
