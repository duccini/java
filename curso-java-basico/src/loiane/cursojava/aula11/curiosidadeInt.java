package loiane.cursojava.aula11;

public class curiosidadeInt {

    public static void main(String[] args) {
        int var1 = 2147483647;
        // valor máximo do inteiro
        // o proximo valor é o valor inteiro minimo, funcionando como uma roleta -2147483647
        Double var2 = 100d;

        System.out.println(var1 + var2);
        System.out.println(var2.getClass());
    }
}
