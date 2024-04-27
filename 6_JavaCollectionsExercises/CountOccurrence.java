import java.util.HashMap;

public class CountOccurrence {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        String s = "This is a great thing";

        char[] characters = s.toCharArray();

        for(char c: characters){
            Integer cur = count.get(c);
            if(cur == null) { // check if key exist in Hashmap
                count.put(c, 1);
            } else {
                count.put(c, cur+1);
            }
        }
        System.out.println(count);
    }
}
