package streams;

import java.util.Arrays;
import java.util.List;

/** Challenge 4:
 *  Remova todos os valores ímpares:
 *  Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */

public class RemoveAllOddNumbersInTheList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Only even numbers: " + evenNumbers);
    }
}
