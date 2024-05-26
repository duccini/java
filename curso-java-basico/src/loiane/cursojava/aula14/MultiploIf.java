package loiane.cursojava.aula14;
import java.util.Scanner;

public class MultiploIf {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();

        // valor <= 10, comprar
        // 10 < valor < 15, pedir desconto
        // 15 <= valor < 20, pesquisar mais
        // valor >= 20, muito caro

        /*
        *   10.50 não funciona
        */

        if (valor <= 10.00) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10.00 && valor < 15.00) {
            System.out.println("Pedir desconto");
        } else if (valor >= 15.00 && valor < 20.00) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }
    }
}
