package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfValuesDivisibleByThreeAndFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);
        if (sum == 0)
            System.out.println("There's not any number inside the list, divisible by 3 and 5 simultaneously");
        else
            System.out.println("Sum is " + sum);
    }
}
