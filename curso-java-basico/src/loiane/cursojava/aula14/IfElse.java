package loiane.cursojava.aula14;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();

        if(idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
