import java.util.Scanner;

public class CaixaLoja {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        double total = 0;


        System.out.println("Valor da compra: ");
        double valorCompra = scanner.nextDouble();


        while (valorCompra != 0 ) {
        total = total + valorCompra;
        
        System.out.print("Valor da compra:");
        valorCompra = scanner.nextDouble();


        }

        
        System.out.println("Total: R$ " + total);
        scanner.close();


    }
}
