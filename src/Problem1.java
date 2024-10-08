import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int sumForLoop(ArrayList<Integer> list){
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    public int sumWhileLoop(ArrayList<Integer> list) {
        int sum = 0;
        int index = 0;

        while (index < list.size()) {
            sum += list.get(index);
            index++;
        }
        return sum;
    }

    public int sumRecursion(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0) + sumRecursion(list.subList(1, list.size()));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Problem1 s = new Problem1();
        System.out.println(s.sumForLoop(list));
        System.out.println(s.sumWhileLoop(list));
        System.out.println(s.sumRecursion(list));
    }
}
