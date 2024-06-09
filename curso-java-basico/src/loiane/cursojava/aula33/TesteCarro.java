package loiane.cursojava.aula33;

public class TesteCarro {
    public static void main (String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Duccati";

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro esportivo = new Carro("Ferrari", "Spada");
        System.out.println(esportivo.marca);
        System.out.println(esportivo.modelo);
    }

}
