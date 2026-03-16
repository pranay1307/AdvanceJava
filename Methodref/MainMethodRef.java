class Circle{
    Circle(){
        System.out.println("This is circle constructor");
    }
    Circle(String msg){
        System.out.println(msg);
    }
   static double area(int r){
        return Math.PI*r*r;
    }
}
@FunctionalInterface
interface CircleInfo
{

    void getInfo(String msg);
}
@FunctionalInterface
interface Area{
    double getArea(int num);
}

public class MainMethodRef {
    public static void main(String[] args) {
        Circle c=new Circle();
        Area ca=Circle::area;   // :: method refrencing
       System.out.println("Area="+ca.getArea(4));
       CircleInfo ci=Circle::new;
       ci.getInfo("This is parameterized constructor");
    }
}