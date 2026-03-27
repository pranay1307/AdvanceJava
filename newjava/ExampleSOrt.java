import java.util.Arrays;
import java.util.List;

public class ExampleSOrt {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        // System.out.println(list);
        // List<Integer> sorted=list.stream().sorted().toList();
        // System.out.println(sorted);

        List<Integer> list=Arrays.asList(12,56,2,78,9,4);
        System.out.println(list);
        int sorted=list.stream()
        .sorted((a,b)->b-a)    //another way to sort in descending order
        // .sorted(Comparator.reverseOrder())
        .skip(1).findFirst().get();
        // .get(1);
        System.out.println(sorted);
    }
    
}