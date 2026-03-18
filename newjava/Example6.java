import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","python","Go","Ruby");
        ArrayList<String> name=new ArrayList<>();
        list.addAll(name);

        List<String> names=list.stream().filter(s -> s.contains("o")).toList();
        System.out.println(names);
        
    }
}