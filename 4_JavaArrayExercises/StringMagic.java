public class StringMagic {
    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {

        // TODO: Write your code here
        if (sentence.length() == 0) return "";
        sentence = sentence.trim();
        String longest = sentence.split(" ")[0];
        for (String word: sentence.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
