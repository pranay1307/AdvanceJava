abstract class Area{
    int r,l,b;
    Area(String msg){
        System.out.println(msg);
    }
    void getArea(){
        System.out.println("this is area class");
    }
}

class Circle extends Area{
    final double PI=3.14; 
    Circle(int r){              //sub class constructor implicitely call parent class  default constructor and if we created then we use super
       super("This is Area constructor");    // this calls parent class constructor and we have to call using this because we created constructor
       this.r=r;
    }
     void getCircleArea(){
        double result=PI* super.r *this.r;    // because of law of inheritance 
        System.out.println("Area of Circle= "+result);
     }
}

public class AreaMain {
    public static void main(String[] args) {
        // Circle c=new Circle(15);
        // c.getArea();
        // c.getCircleArea();

        // Area a=new Circle(34);      //upcasting-polymorphism
        // a.getArea();
        // Circle c= (Circle) new Area("abc");    //downcasting  
        // c.getArea();
        // c.getCircleArea();       
           
    }
}


// abstract class are incomplete the
// obj of abstract class can be declare but not instantiated
