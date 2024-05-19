package streams;

import java.util.Arrays;
import java.util.List;

public class ListOfOddNumbersMultipleOfThreeandFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numbers.stream()
                .distinct()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .forEach(System.out::println);
    }
}
