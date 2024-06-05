import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro:");

        int numero = scanner.nextInt();
        // Loop de 2 até o número digitado pelo usuário
        for (int i = 2; i <= numero; i++) {
            // Verifica se o número atual é primo
            if (numero_primo(i)) {
                System.out.println(i); // Se for primo, imprime o número
            }
        }
    }
}