package streams;

import java.util.Arrays;
import java.util.List;

public class PrintPairNumberOfTheList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbers.stream()
                .filter(x -> x % 2 == 0) // Filters only even numbers in the list
                .sorted() // Sort the list in the natural order of the elements
                .forEach(System.out::println); // Iterate all the elements inside numbers to show them using Method reference
    }
}
