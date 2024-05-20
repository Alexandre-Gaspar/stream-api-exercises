package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 3:
 *  Verifique se todos os números da lista são positivos:
 *  Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

public class CheckIfAllNumbersOfTheListArePositive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean areAllElementsPositive = numbers.stream().allMatch(n -> n > 0);
        System.out.println("Are all elements positive? " + areAllElementsPositive); // Check if all elements in numbers are positive numbers
    }
}
