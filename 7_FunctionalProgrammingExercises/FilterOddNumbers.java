import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {

    public class FunctionalProgrammingMagic {

        /**
         * This method filters out the odd numbers from a given list of integers.
         * @param numbers This is the list of integers from which odd numbers are to be filtered out.
         * @return List<Integer> This returns a list of odd integers.
         */
        public static List<Integer> filterOddNumbers(List<Integer> numbers) {

            // Write your code here
            return numbers.stream().filter(
                    num -> {
                        return (num % 2 == 1 || num % 2 == -1);
                    }
            ).collect(
                    Collectors.toList()
            );
        }
    }
}
