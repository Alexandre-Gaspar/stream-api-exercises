package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindTheSecondLargestValueInTheList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numbers.stream()
                .sorted()
                .toList()
                .get(numbers.size()-2)
        );
    }
}