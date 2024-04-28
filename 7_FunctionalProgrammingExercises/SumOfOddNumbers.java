import java.util.List;

public class SumOfOddNumbers {
    public static int sumOddNum(List<Integer> intList) {
        int sum = intList.stream()
                .filter(
                        num -> num % 2 != 0
                )
                .reduce(0, (n1, n2) -> n1 + n2);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 6, 8, 13, 3, 15);
        System.out.println(sumOddNum(nums));
    }
}
