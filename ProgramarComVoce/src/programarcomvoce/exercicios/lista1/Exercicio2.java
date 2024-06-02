package programarcomvoce.exercicios.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");

        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor");

        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " é o maior valor.");
        } else if (valor2 > valor1) {
            System.out.println(valor2 + " é o maior valor");
        } else {
            System.out.println("Os valores são iguais");
        }


    }
}
