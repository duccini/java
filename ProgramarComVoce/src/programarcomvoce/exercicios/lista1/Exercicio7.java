package programarcomvoce.exercicios.lista1;

public class Exercicio7 {

    public static void main (String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                double number = (double) i / 2; // pq (double)
                System.out.println(number);
            }
        }
    }


}
