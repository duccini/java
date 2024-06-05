package programarcomvoce.exercicios.lista1;

public class Exercicio3 {

    int verificarNumeroPrimo(int numero) {
        if((numero % 2 != 0) && (numero % 3 != 0) && (numero % 5 != 0) && (numero % 7 != 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    int[] arrayNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    for(int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
    }

    for(int i = 0; i < arrayNumeros.length; i++) {
        teste = verificarNumeroPrimo(arrayNumeros[i]);

        if (teste > 0) {
            System.out.println("O número " + arrayNumeros[i] + " é primo.");
        } else {
            System.out.println("O número " + arrayNumeros[i] + " é composto.");
        }
    }

}
