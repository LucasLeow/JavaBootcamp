import java.util.ArrayList;
import java.util.Collections;

public class AnagramChecker {
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) return false;
        if (s1.length() != s2.length()) return false;

        s1 = s1.trim().toLowerCase();
        s2 = s2.trim().toLowerCase();

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        ArrayList<Character> s1AL = new ArrayList<>();
        ArrayList<Character> s2AL = new ArrayList<>();

        for(int i = 0; i < s1Chars.length; i++) {
            s1AL.add(s1Chars[i]);
            s2AL.add(s2Chars[i]);
        }

        Collections.sort(s1AL);
        Collections.sort(s2AL);

        return s1AL.equals(s2AL);
    }
}
