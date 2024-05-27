package loiane.cursojava.aula18;

import java.util.Scanner;

public class Label {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scanner.nextInt();

        System.out.println("Entre com um limite");
        int max = scanner.nextInt();

        // encontrar o primeiro numero maior que num, menor do  ue max que é divisivel por 7
        for(int i = num; i <= max; i++) {
            if(i % 7 == 0) {
                System.out.println("O primeiro número divisível por 7 no intervalo é: " + i);
                break; // utilização do break na sua maioria
            }
        }

        // encontrar todos os numeros no intervalo que não são divisiveis por 7
        for(int i = num; i <= max; i++) {
            if(i % 7 == 0) {
                continue;
            }
            System.out.println("Os números que não são divisíveis por 7 são: " + i);
        }

        // Rótulos
        for (int i = 0; i <= 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) {
                            break rotulo1; // saia e vai para o rotulo1 GOTO
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
    }
}
