import java.util.List;

public class PrintUsingFP {
    public static void printWords(List<String> strList) {
        strList.stream().forEach(str -> {
            if (str.endsWith("at")) System.out.println(str);
        });
    }

    public static void main(String[] args) {
        List<String> strList = List.of("Apple", "Cat", "Bat", "Banana");
        printWords(strList);
    }
}
