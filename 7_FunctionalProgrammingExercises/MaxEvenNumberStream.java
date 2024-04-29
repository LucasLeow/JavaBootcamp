import java.util.List;
import java.util.Optional;

public class MaxEvenNumberStream {
    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if (numbers == null || numbers.size() == 0) return 0;

        return numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
    }
}
