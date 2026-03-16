@FunctionalInterface
interface Calc{
    void add(int n1,int n2);
}
public class MainLamda {
    public static void main(String[] args) {
            Calc sum=(int n1,int n2)->{
                System.out.println("Sum=");
                System.out.println((n1+n2));
            };
            sum.add(23,24);
            Calc sum1=(int n1,int n2)->System.out.println("Sum="+(n1+n2));     
            sum.add(23,24);
    }
}