import java.util.Arrays;
import java.util.List;

public class ReduceEx10{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
       List <Integer> result=list.stream().filter(x->x%2==0).sorted().toList();
        System.out.println(result);
    }
}