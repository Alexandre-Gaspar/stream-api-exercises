package streams;

import java.util.Arrays;
import java.util.List;

public class SumAll {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum is " + sum);
    }
}