import  java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();


        if (nota >= 7) {

            System.out.println(nome + ", você foi aprovada.");

        } else if (nota >= 5) {
            System.out.println(nome + ", você ficou de recuperação.");
            
        } else {
            System.out.println(nome + ", Você foi reprovada. Continue estudando!");

         }

        scanner.close();

    }
}
