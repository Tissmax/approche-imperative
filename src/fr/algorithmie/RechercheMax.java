package fr.algorithmie;

import java.util.Arrays;
import java.util.OptionalInt;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        OptionalInt max = Arrays.stream(array).max();
        System.out.println(max);
    }
}
