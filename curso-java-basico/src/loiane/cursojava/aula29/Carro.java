package loiane.cursojava.aula29;

public class Carro {

    // Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Construtor
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        System.out.println("A classe carro foi instanciada.");
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;

    }

    public Carro() {
        super();
    }



    // Métodos
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km / consumoCombustivel;
    }
}
