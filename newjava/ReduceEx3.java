import java.util.Arrays;
import java.util.List;

public class ReduceEx3{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(12,14,54,67,14,178,96);
        long result=list.stream().reduce(0,(a,b)->{if(b%2==0){
            return a+b;
        }else{
            return a;
        }});
        System.out.println(result);
    }
}