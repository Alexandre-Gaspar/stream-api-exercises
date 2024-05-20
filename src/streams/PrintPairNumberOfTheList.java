package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 2:
 *  Imprima a soma dos números pares da lista:
 *  Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */

public class PrintPairNumberOfTheList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sumOfPairNumbers = numbers.stream()
                .filter(x -> x % 2 == 0) // Filters only even numbers in the list
                .mapToInt(Integer::intValue)
                .sum(); // Iterate all the elements inside numbers to show them using Method reference
        System.out.println("Sum of pair numbers is " + sumOfPairNumbers);
    }
}
