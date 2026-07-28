import java.util.Scanner;

public class CadastroPessoa {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        

        System.out.println("===== CADASTRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("====================");

        scanner.close();

    }

}
