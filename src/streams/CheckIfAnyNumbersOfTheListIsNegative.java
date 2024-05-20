package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 15:
 *  Verifique se a lista contém pelo menos um número negativo:
 *  Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 */

public class CheckIfAnyNumbersOfTheListIsNegative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean hasAnyNegativeNumber = numbers.stream().anyMatch(n -> n < 0);
        System.out.println("Has any negative number in the list? " + hasAnyNegativeNumber); // Verify if any element in numbers is greater NEGATIVE
    }
}
