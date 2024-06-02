package programarcomvoce.exercicios.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feita", "Quinta-feira", "Sexta-feira", "Sábado"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 7");

        int dia = scan.nextInt();

        if (dia > 7 || dia < 1) {
            System.out.println("O dia não é válido");
        } else {
            System.out.println(diasDaSemana[dia - 1]);
        }


    }

}
