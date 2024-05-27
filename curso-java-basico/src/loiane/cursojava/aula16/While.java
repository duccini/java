package loiane.cursojava.aula16;

public class While {
    public static void main (String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contanto até " + max);

        while(i <= max) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println(i); // i = 11

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 11);

        System.out.println(i);
    }

}
