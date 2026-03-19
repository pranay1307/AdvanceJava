import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleMap1 {
    public static void main(String[] args) {
        List<Integer> marks=Arrays.asList(10,45,45,75,80,91,67,76);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(marks);
        System.out.println(list);
        List<Integer> grace5=list.stream().map(m->m*m).toList();
        System.out.println(grace5);
    }
}