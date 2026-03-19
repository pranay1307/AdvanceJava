import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Stud{
    private int sid;
    private String name;
    private int marks;
     Stud(int sid,String name, int marks) {
        super();
        this.sid=sid;
        this.name = name;
        this.marks = marks;
    }
    public int getsid(){
        return sid;
    }
    public void setsid(int sid){
            this.sid=sid;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
            this.name=name;
    }
    public int getmarks(){
        return marks;
    }
    public void setmarks(int marks){
            this.marks=marks;
    }
    @Override
    public String toString() {
        return "Stud{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class Example7 {
    public static void main(String[] args) {
        List<Stud> students = new ArrayList<Stud>();
        students.add(new Stud(1,"Student1",60));
        students.add(new Stud(2,"Student2",70));
        students.add(new Stud(3,"Student3",50));
        students.add(new Stud(4,"Student4",80));
        students.add(new Stud(5,"Student5",40));

        // Filter students with marks > 60
        List<Stud> g60=students.stream()
                .filter(student -> student.getmarks() > 60).toList();
        g60.stream().forEach(System.out::println);
    }
    }
