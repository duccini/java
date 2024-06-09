package loiane.cursojava.aula35;

public class Recursividade {

    public static void main (String[] args) {

        int res1 = Calculadora.fatorialNaoRecursivo(5);
        System.out.println("Fatorial não Recursivo: " + res1);

        int res2 = Calculadora.fatorialRecursivo(5);
        System.out.println("Fatorial Recursivo: " + res2);
    }

}
