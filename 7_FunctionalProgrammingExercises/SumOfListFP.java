import java.util.List;

public class SumOfListFP {

    // .reduce(<aggregator>, callBack) : return value of callBack added to aggregator
    public static int sum(List<Integer> numList) {
        int sum = numList.stream()
                .reduce(0, (n1, n2) -> n1 + n2);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numList = List.of(4, 6, 23, 42, 56);
        System.out.println(sum(numList));
    }
}
