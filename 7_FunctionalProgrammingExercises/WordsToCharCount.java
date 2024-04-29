import java.util.List;
import java.util.stream.Collectors;

public class WordsToCharCount {
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if (courses == null) return List.of();

        return courses.stream().map(str -> str.length())
                .collect(Collectors.toList());
    }
}
