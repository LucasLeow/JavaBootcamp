import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class FirstNCubes {
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        if (n == 0) return List.of();

        return IntStream.range(1, n + 1)
                .map(num -> num * num * num)
                .boxed()
                .collect(Collectors.toList());
    }
}
