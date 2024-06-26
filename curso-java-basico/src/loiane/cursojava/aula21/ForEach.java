package loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main (String[] args) {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exemplo com arrays multidimensionais");
        double[][] notasAlunos = new double[2][4]; // 30 alunos, 4 notas

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9.5;

        for (double[] notasAluno : notasAlunos) {
            for (double nota : notasAluno) {
                System.out.println(nota + " ");
            }
            System.out.println();
        }
    }
}
