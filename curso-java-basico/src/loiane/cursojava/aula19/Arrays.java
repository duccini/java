package loiane.cursojava.aula19;

public class Arrays {
    public static void main (String[] args) {
        double[] temperaturas = new double[30]; // precisa indicar o tamanho

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 34;
        temperaturas[3] = 33.1;
        temperaturas[4] = 33.7;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do array: " + temperaturas.length);

        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1)  + " é: " + temperaturas[i]);
        }

        // Loop Melhorado
        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }

}
