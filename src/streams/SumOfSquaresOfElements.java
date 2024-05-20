package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 11:
 *  Encontre a soma dos quadrados de todos os números da lista:
 *  Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */

public class SumOfSquaresOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of all elements is " + sumOfSquares);
    }
}
