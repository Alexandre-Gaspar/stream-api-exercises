package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 8:
 *  Somar os dígitos de todos os números da lista:
 *  Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

public class SumAll {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum is " + sum);
    }
}
