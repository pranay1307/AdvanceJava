import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleMap4 {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("A","B","C");
        ArrayList<String> list=new ArrayList<String>();
        list.addAll(names);
        System.out.println(list);
        List<String> grace5=list.stream().map(m->"Item-"+m).toList();
        System.out.println(grace5);
    }
}mnjkhb