import java.util.ArrayList;

public class NumerosPares {
    private static int numeroMin = 0;
    private static int numeroMax = 50;

    public static void main(String[] args) {
        encontrarPar(numeroMin, numeroMax);
    }

    public static void encontrarPar(int numeroMin, int numeroMax) {
        ArrayList<Integer> numeroPares = new ArrayList<>();
        for (int i = numeroMin; i < numeroMax; i++) {
            if (i % 2 == 0) {
                numeroPares.add(i);
            }
        }
        System.out.println(numeroPares);
    }
}
