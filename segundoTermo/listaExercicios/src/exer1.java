import java.util.Scanner;

public class exer1{
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);  

      System.out.println ("Entre com seu nome: ");
      String nomeUsuario = scanner.nextLine();

      System.out.println ("Entre com sua cidade:" );
      String nomeCidade = scanner.nextLine();

      System.out.println ("Entre com sua idade: ");
      int idadeUsuario = scanner.nextInt();

      System.out.println ("Ola! Meu nome e " + nomeUsuario + ", tenho " + idadeUsuario + " anos e moro em " + nomeCidade);


	scanner.close();
      

    }
}