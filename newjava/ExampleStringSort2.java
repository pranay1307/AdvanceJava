import java.util.Arrays;
import java.util.List;

public class ExampleStringSort2
{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","programming","javascrpit","vikas");
        List<String> result=list.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(result);

    }
}
