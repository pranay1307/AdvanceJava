import java.util.Arrays;
import java.util.List;

public class ReduceEx2{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,14,54,67,14,178,96);
        long result=list.stream().reduce(0,(a,b)->a+1);
        System.out.println("Count:"+result);
    }
}