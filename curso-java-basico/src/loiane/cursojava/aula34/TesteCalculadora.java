package loiane.cursojava.aula34;

public class TesteCalculadora {
    static int resultadoSoma;

    public static void main (String[] args) {
        resultadoSoma = MinhaCalculadora.soma(1, 2);
        System.out.println(resultadoSoma);
    }
}
