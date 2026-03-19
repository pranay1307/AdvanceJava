import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleMap3 {
    public static void main(String[] args) {
        List<Integer> marks=Arrays.asList(1,2,3,4,5);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(marks);
        System.out.println(list);
        List<String> grace5=list.stream().map(m->String.valueOf(m)).toList();
        System.out.println(grace5);
    }
}