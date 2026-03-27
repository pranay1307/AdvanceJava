import java.util.Arrays;
import java.util.List;

public class ReduceEx4 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("java","Stream","API","Reduce");
        String result=list.stream().reduce("",(a,b)->a+ b);
        System.out.println(result);
    }
}