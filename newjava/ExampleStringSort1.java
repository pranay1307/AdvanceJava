import java.util.Arrays;
import java.util.List;

public class ExampleStringSort1{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","programming","javascrpit");
        List<String> result=list.stream().sorted().toList();
        System.out.println(result);

    }
}