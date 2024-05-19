package streams;

import java.util.Arrays;
import java.util.List;

public class CalculateAverageOfNumbersGreaterThanFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int average = numbers.stream()
                .filter(n -> n > 5)
                .reduce(0, (n1, n2) -> (n1 + n2)/2);
        System.out.println("Average of numbers greater than five is " + average);
    }
}
