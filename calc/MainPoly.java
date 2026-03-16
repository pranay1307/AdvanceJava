class Animal{
    String name;
    String sound;
    void makeSound(){
        System.out.println("this is animal class");
        
    }
     String makeSound(String name){
        String result=String.format("Name=%s and Sound=%s",name);
        return "";
    }

    void makeSound(String name,String sound){
        String result=String.format("Name=%s and Sound=%s",name, sound);
        System.out.println(result);
    }
     void display(){
        String result=String.format("Name=%s and Sound=%s",name, sound);
        System.out.println(result);
    }


}
class Cat extends Animal{
    int legs;
    Cat(String name,String sound,int legs){
      super.name=name;
      super.sound=sound;
      this.legs=legs;
    }
//     @Override
//     void makeSound(){
//         System.out.println("This is Animal class");
//     }
    void makeSound(){
        String result=String.format("Name=%s and Sound=%s and legs=%s",name, sound,legs);
        System.out.println(result);
    }
        void displayInfo(){
        String result=String.format("Name=%s and Sound=%s",name, sound);
        System.out.println(result);
    }
}
public class MainPoly {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.makeSound();;
        a.makeSound("Dog","Bark");
        a.display();
        Cat c1=new Cat("Cat1","meoq",4);
        c1.makeSound(); 


    }
}