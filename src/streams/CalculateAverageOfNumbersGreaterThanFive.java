package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 5:
 * Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
*/

public class CalculateAverageOfNumbersGreaterThanFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 4, 2);

        System.out.print("Average of numbers greater than five is ");
        numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        // Another idea...but ceil to up the value
        int average = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .reduce(0, (n1, n2) -> (n1 + n2)/2);
        System.out.println("Average of numbers greater than five is " + average);
    }
}
