import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted().toList();
        // System.out.println(sorted);

        List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        System.out.println(list);
        List<Integer> sorted=list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(sorted);
    }
    
}