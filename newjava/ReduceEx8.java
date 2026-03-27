import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx8{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList();
        int n=5;
        int result=IntStream.rangeClosed(1, n).reduce(1,(a,b)->(a*b));
        System.out.println(result);
    }
}