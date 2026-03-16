
class Sum{
    int num1,num2;
    Sum(){}
    
    Sum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getSum(){
        System.out.println("Sum="+(num1+num2));
    }
}

public class Calculator{
     public static void main(String[] args) {
          Sum s1; //object declaration
          s1=new Sum();  //object instantion
          s1.getSum();   

         }
     }