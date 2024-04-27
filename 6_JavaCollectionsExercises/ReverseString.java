public class ReverseString {
    public static String reverseWordsInSentence(String sentence) {
        if (sentence == null) return "INVALID";
        if (sentence.isEmpty()) return "";

        String[] words = sentence.split(" ");
        StringBuilder reversed_sentence = new StringBuilder("");

        for (String word: words) {
            StringBuilder reversed_word = new StringBuilder(word);
            reversed_sentence.append(reversed_word.reverse());
            reversed_sentence.append(" ");
        }
        return reversed_sentence.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordsInSentence("Hello World"));
    }
}
