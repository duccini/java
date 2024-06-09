package loiane.cursojava.aula33;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double consumoCombustivel;
    double capCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double consumoCombustivel, double capCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.consumoCombustivel = consumoCombustivel;
        this.capCombustivel = capCombustivel;
        System.out.println("Chamando o construtor com 5 parâmetros");
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Chamando o construtor com 2 parâmetros");
    }

    public Carro() {
        System.out.println("Chamando o construtor sem parâmetros");
    }

}
