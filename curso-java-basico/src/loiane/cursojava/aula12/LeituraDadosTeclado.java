package loiane.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;


public class LeituraDadosTeclado {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double alt;

        /*
        System.out.println("Digite seu nome");
        String name = scan.nextLine();
        System.out.println("Seu nome é: " + name);

        System.out.println("Digite sua idade");
        int age = scan.nextInt();
        System.out.println("Sua idade é " + age);

        System.out.println("Digite seu nome, idade, altura e se é casado.");
        String nome = scan.next();
        int idade = scan.nextInt();
        double altura = scan.nextDouble();
        boolean casado = scan.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Casado: " + casado);
        */

        alt = scan.nextDouble();
        System.out.println("Altura: " + alt);
    }
}
