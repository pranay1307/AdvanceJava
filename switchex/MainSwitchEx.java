// yield in switch means return


public class MainSwitchEx {
    public static void main(String[] args) {
        int day=1;
        String result=switch(day){
            case 1,7->{
                System.out.println("this is 1 & 7 case"); yield "Monday";}
            case 2->"Tuesday";
            default->"No day";
        };
       System.out.println(result);
    }
}