// class Student{
//     int sid;
//     String name;
//     int rollno; 
// }

record Student(int sid,String name,int rollno){};

public class RecordMain {
    public static void main(String[] args) {
        Student s=new Student(1,"Student1",1);
        System.out.println("student id="+s.sid());
        System.out.println("student id="+s.name());
        System.out.println("student id="+s.rollno());
    }
}