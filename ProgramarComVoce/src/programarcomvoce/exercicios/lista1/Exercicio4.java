package programarcomvoce.exercicios.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite uma distância em Milhas");
        double distanciaEmMilhas = scan.nextDouble();
        double distanciaEmQuilometros = distanciaEmMilhas / 1.609;

        System.out.println("A distância em Quilômetros é: " + distanciaEmQuilometros);
    }

}
