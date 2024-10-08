import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        List<String> list2 = Arrays.asList("a", "b", "c", "d");
        System.out.println(combineAlternating(list1, list2));
    }

    public static List<String> combineAlternating(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();

        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
