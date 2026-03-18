import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        //  List<String> list = Arrays.asList("cat", "apple", "bat", "banana", "dog");
         List<String> list = Arrays.asList("cat", "apple", null, "banana", null);
         ArrayList<String> name=new ArrayList<>();
         name.addAll(list);

        List<String> names=list.stream()
            .filter(item -> item!=null)
            .toList();

            System.out.println(names);
    }
}