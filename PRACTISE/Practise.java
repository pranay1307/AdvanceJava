@FunctionalInterface
interface Square{
    int square(int n);
}
public class Practise {
    public static void main(String[] args) {
           Square s=(n)->n*n;
           System.out.println(s.square(5));      
    }
}