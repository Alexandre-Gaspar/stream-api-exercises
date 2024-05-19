package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListOfEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> oddNumbers = filterList(numbers, n -> n % 2 != 0);
        List<Integer> evenNumbers = filterList(numbers, n -> n % 2 == 0);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    static List<Integer> filterList(List<Integer> list, Predicate<Integer> p) {
        return list.stream().distinct().filter(p).toList();
    }
}
