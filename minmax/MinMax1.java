import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// in min condition matters the most if we print list in descending order then it will print min as 1st value of list
public class MinMax1{
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(23,12,6,67,89,43);
        Optional<Integer> result=list.stream().min((a,b)->a-b);
        result.ifPresent((System.out::println));
        
    }
}