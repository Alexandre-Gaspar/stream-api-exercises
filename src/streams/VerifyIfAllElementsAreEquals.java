package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 18:
 *  Verifique se todos os números da lista são iguais:
 *  Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

public class VerifyIfAllElementsAreEquals {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean areAllElementsEqual = numbers.stream().distinct().count() == numbers.size();
        System.out.println("Are all elements equal? " + areAllElementsEqual);
    }
}
