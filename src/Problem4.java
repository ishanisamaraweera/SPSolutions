import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
        System.out.println(largestPossibleNumber(numbers));
    }
    public static String largestPossibleNumber(List<Integer> numbers) {
        List<String> numStrings = new ArrayList<>();
        for (Integer number : numbers) {
            numStrings.add(String.valueOf(number));
        }

        Collections.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));

        if (numStrings.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numStr : numStrings) {
            result.append(numStr);
        }

        return result.toString();
    }
}
