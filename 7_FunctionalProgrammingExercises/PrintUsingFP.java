import java.util.List;

public class PrintUsingFP {
    public static void printNumbers(List<Integer> numList) {
        numList.stream().forEach(num -> System.out.println(num));
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        printNumbers(nums);
    }
}
