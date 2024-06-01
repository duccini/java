package loiane.cursojava.cula30;

public class Carro {

    // Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Construtor
    Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        System.out.println("A classe carro foi instanciada.");
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;

    }

    public Carro() {
        super();
    }
}
