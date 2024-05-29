package loiane.cursojava.aula26;

public class Carro {

    // Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

}
