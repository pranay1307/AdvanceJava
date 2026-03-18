// sequence of elements that can be processed in a pipeline of operations such as filtering,mapping,sorting and reducing. is called stream.
// stream donot store data we have to store them in collection.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamX {
    public static void main(String[] args) {
        List data=Arrays.asList(23,45,67,87,65);
        // List data=List.of(23,45,67,87,65);
        // Stream info=Stream.of(23,45,67,86,"info",34.56);
        ArrayList<Integer> list=new ArrayList<Integer>();
        // list.add(73);
        // list.addAll(List.of(34,56,78));
        list.addAll(data);

        System.out.println(list);
        List<Integer> g50=list.stream().filter(n->n>50).collect(Collectors.toList());
        list.stream().filter((n)->n>60).forEach(System.out::println);
//     Stream ListStream=list.stream();
//    ListStream.filter(null).toList();
        
    }
}