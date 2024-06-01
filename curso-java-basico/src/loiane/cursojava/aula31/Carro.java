package loiane.cursojava.aula31;

public class Carro {

    // Atributos
    public String marca;
    String modelo;
    int numPassageiros;
    protected double capCombustivel;
    private double consumoCombustivel;

    public Carro() {
        System.out.println("A classe carro foi instanciada");
        this.consumoCombustivel = 0.2;
    }

    // Métodos
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km.");
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel (double km) {
        return km / this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return this.divideKMPorConsumoCombustivel(km);
    }
}
