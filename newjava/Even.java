import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Even {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,11,17,16);
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.addAll(list);
        

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}