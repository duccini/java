package loiane.cursojava.cula30;

public class TesteCarro {

    public static void main (String[] args) {

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
    }
}
