
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

    //     List<Integer> list = Arrays.asList(10, 25, 50, 55, 60, 65, 70);
    //     ArrayList<Integer> num=new ArrayList<Integer>();
    //     num.addAll(list);
    //    List<Integer> listA=list.stream()
    //         .filter(n -> n >= 50 && n <= 60)
    //         .toList();
    //         System.out.println(listA);

     List<Integer> list = Arrays.asList(10, 25, 50, 55, 60, 65, 70);
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.addAll(list);
       List<Integer> listA=list.stream()
            .filter(n -> n %2==0).filter(n->n>15)
            .toList();
            System.out.println(listA);
    }
}