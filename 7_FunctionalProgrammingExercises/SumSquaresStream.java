import java.util.List;
public class SumSquaresStream {
    public static long sumOfSquares(List<Integer> numbers) {

        if (numbers == null) return 0;

        return numbers
                .stream()
                .map(num -> num * num)
                .reduce(0, (n1, n2) -> n1 + n2);
    }
}
