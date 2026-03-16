// abstract class Area{
//     abstract void getArea();
// }
// class Rectangle extends Area{
//     int l,b;
//     Rectangle(int l,int b){
//         this.l=l;
//         this.b=b;
//     }
//     void getArea(){
//        int r=l*b;
//        System.out.println("Area of Rectangle is= "+r);
//     }
//     void displayresult(){
//         System.out.println("This is display function in rectangle");
//     }
// }

// public class MainArea {
//     public static void main(String[] args) {
//         Rectangle r1=new Rectangle(24,4);
//         r1.getArea();
//         r1.displayresult();
//         Area r2=new Rectangle(34,4);
//         r2.getArea();
//         Area circle=new Area(){
//             @Override
//             void getArea(){
//                 System.out.println("Area of Circle is= " + (3.14 * 5 * 5));
//             }
//         };
//         circle.getArea();
      
//     }
// }


interface   Area{
    abstract void getArea();
}
class Rectangle implements Area{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void getArea(){
       int r=l*b;
       System.out.println("Area of Rectangle is= "+r);
    }
    void displayresult(){
        System.out.println("This is display function in rectangle");
    }
}

public class MainArea {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(24,4);
        r1.getArea();
        r1.displayresult();
        Area r2=new Rectangle(34,4);
        r2.getArea();
        Area circle=new Area(){
            int r=4;
            @Override
            public void getArea(){
                System.out.println("Area of Circle is= " + (3.14 * r * r));
            }
        };
        circle.getArea();
      
    }
}