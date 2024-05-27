package loiane.cursojava.aula17;

public class LoopFor {
    public static void main (String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        for(int i = 5; i >= 0; i--) {
            System.out.println("i: " + i);
        }

        for(int i = 0, j = 5; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }

        for(int count = 0; count < 10; count += 2) {
            System.out.println("O valor de count é: " + count);
        }
    }
}
