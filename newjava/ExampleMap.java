
import java.util.*;

public class ExampleMap {
    public static void main(String[] args) {
         List<String> names=Arrays.asList("sachin","rahul","amit");
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(names);
        System.out.println(list);
        List<String> grace5=list.stream().map(m->m.toUpperCase()).toList();
        System.out.println(grace5);
    }
}