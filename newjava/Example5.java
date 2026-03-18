import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,20,30,30);
        list.stream()
            .distinct()              // remove duplicates
            .filter(n -> n > 15)     // numbers > 15
            .forEach(System.out::println);
    }
}