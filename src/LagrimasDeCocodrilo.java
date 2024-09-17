import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class LagrimasDeCocodrilo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numeroAnimal = 0;
        ArrayList<String> nombresAnimales = new ArrayList<>(numeroAnimal);

        System.out.println("Introduce un numero de animales: ");
        numeroAnimal = tc.nextInt();
        tc.nextLine();
        System.out.println("Introduce un nombre de un animal: ");
        System.out.println("Num Animales: " + numeroAnimal);
        do {
            String animal = tc.nextLine();
            if (animal.length() > 11) {
                System.out.println("Error");
            } else {
                nombresAnimales.add(animal);
            }
        } while (nombresAnimales.size() < numeroAnimal);

        // Este valor me sirve para contar solo los nombres de los animales con un número de vocales en concreto incluyendo repetidos
        int contLlorones = 0;

        for (String nombreAnimal : nombresAnimales) {
            int numeroVocales = contarVocal(nombreAnimal);
            System.out.println("El nombre " + nombreAnimal + " tiene " + numeroVocales + " vocales.");

            //Esto lo he realizado para restringir las palabras de 2 vocales o más diferentes incluyendo repetidos
            if (numeroVocales >= 2 && numeroVocales < 3) {
                contLlorones++;
            }
        }
        System.out.println("Salida numero de animales llorones: "+ contLlorones);

    }

    public static int contarVocal(String nombreAnimal) {
        Set<Character> setVocalEncontrada = new HashSet<>();
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < nombreAnimal.length(); i++) {
            char caracterActual = nombreAnimal.charAt(i);
            // Comprueba si el carácter actual es una vocal y si no se ha añadido antes
            if (vocales.indexOf(caracterActual) != -1) {
                setVocalEncontrada.add(Character.toLowerCase(caracterActual));
            }
        }
        return setVocalEncontrada.size();
    }
}
