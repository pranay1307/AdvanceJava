import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Minmax2{
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(23,12,6,67,89,43);
        Optional<Integer> result=list.stream().max((a,b)->a-b);
        result.ifPresent((System.out::println));
        
    }
}