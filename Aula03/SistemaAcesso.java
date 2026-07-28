import java.util.Scanner;

public class SistemaAcesso {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.print("Possui ingresso? ");
    boolean possuiIngresso = scanner.nextBoolean();

    System.out.print("Você é funcionário? ");
    boolean funcionario = scanner.nextBoolean();


    if ((idade >= 18 && possuiIngresso) || funcionario) {
        System.out.println("Entrada permitida.");
        
    }else {
        System.out.println("Entrada negada.");
    }

    scanner.close();
    }

}
