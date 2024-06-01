package loiane.cursojava.aula31;

public class TesteCarro {

    public static void main (String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Ducate";

        double consumoCombustivel = carro.calcularCombustivel(25);
        System.out.println(consumoCombustivel);

    }
}
