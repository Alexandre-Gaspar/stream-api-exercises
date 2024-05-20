package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 12:
 *  Encontre o produto de todos os números da lista:
 *  Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */

public class ProductOfAllElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println("Product of all element is "
                + numbers.stream()
                .reduce((n1, n2) -> n1 * n2)
                .get()
        );
    }
}
