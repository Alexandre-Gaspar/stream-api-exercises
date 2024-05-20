package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Challenge 1:
 *  Mostre a lista na ordem numérica:
 *  Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */

public class ShowListByNumericOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream()
                .sorted(Comparator.naturalOrder()) // Sort the list in the natural order of the elements
                .forEach(System.out::println); // Iterate all the elements inside numbers to show them using Method reference
    }
}