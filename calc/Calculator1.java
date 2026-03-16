class Multiplication{
        

        void getMul(int num1,int num2){
                System.out.println("Product: "+(num1*num2));
        }
}

class Calculator1{
        public static void main(String[] args) {
            Multiplication m1=new Multiplication();
            m1.getMul(2,3);
            
        }
    
}