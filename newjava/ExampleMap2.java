import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleMap2 {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("sachin","rahul","amit");
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(names);
        System.out.println(list);
        List<Character> grace5=list.stream().map(m->m.charAt(0)).toList();
        System.out.println(grace5);
    }
}