import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainForeach {
    public static void main(String[] args) {
          int data[]=new int[] {12,34,5,66,78,45};

          List<Integer> listData=Arrays.stream(data).boxed().collect(Collectors.toList());
          //listData.forEach((item)->System.out.println(item));
          listData.forEach(System.out::println); 
    }
}