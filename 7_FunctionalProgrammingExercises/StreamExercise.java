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

    public static void makeLowercase(List<String> strList) {
        strList.stream().map(str -> str.toLowerCase()).forEach(str -> System.out.println(str));
    }

    public static void printStrLength(List<String> strList) {
        strList.stream().map(str -> str.length()).forEach(len -> System.out.println(len));
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
        List<String> strList = List.of("Apple", "Ant", "Bat");

//        printFirst10Squares(numbers);
//        makeLowercase(strList);
        printStrLength(strList);
    }
}
