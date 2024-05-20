package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/** Challenge 7:
 *  Encontrar o segundo número maior da lista:
 *  Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

public class FindTheSecondLargestValueInTheList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numbers.stream()
                .sorted()
                .toList()
                .get(numbers.size()-2)
        );

        Optional<Integer> secondLargestValue = numbers.stream()
                .distinct()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst();

        secondLargestValue.ifPresentOrElse(
                num -> System.out.println("The second greater number of the list is " + num),
                () -> System.out.println("The list hasn't any second greater number.")
        );
    }
}