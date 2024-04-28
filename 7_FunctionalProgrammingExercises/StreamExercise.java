import java.util.List;
import java.util.stream.IntStream;

public class StreamExercise {
    public static void printFirst10Squares(List<Integer> numList) {
        int n = 10;
        if (numList.size() < 10) n = numList.size();

        IntStream.range(0, n).forEach(idx -> {
            System.out.println(numList.get(idx) * numList.get(idx));
        });
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        printFirst10Squares(numbers);
    }
}
