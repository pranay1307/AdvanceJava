// inititialiation is must in var in java
// var lets the compiler automatically figure out the variable’s data type based on the value you assign to it.
// local declare hota hai var
// """ this is called text block introduced in java 17 """ 

class Message {
    void getMessage(){
        System.out.println("This called by var");
    }
}

public class MainVar {
    public static void main(String[] args) {
        String msg="""
        
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
        
        
        """;
      System.out.println(msg);


      
        // var m=new Message();
        // m.getMessage();
        
        // var n1=10.50;
        // var n2=20;
        //  var s=n1+n2;
        // System.out.println(s);
    }
}