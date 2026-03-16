
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Exercise {
    public static void main(String[] args) {
        Runnable r=new Runnable(){  
            @Override
            public void run(){
                System.out.println("This is run method anonymous class");
            }
        };
        Runnable r2=()->System.out.println("This is run method lambda expression");
        r2.run();

        Comparator<Integer> comp=new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        };
        Comparator<Integer> comp2=(Integer a,Integer b)->a-b;
        System.out.println(comp2.compare(3, 4));

        Callable<Integer> c=new Callable<Integer>(){
            public Integer call(){
                return 100;
            }
        };
        Callable<Integer> c1=()->100;
    }
}