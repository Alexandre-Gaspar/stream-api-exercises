package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/** Challenge 18
 *  Verifique se todos os números da lista são iguais:
 *  Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

public class CheckIfAllElementsAreEquals {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean isAllEquals = numbers.stream().distinct().count() == 1;
        System.out.println("Are all elements equals in the list? " + isAllEquals);
    }
}
