interface Message{
    void displayMsg();
    default void display(String msg){
        System.out.println(msg);
    }
    static void displayInfo(){
        System.out.println("This is displaying info");
    }
    private void msginfo(String msg){
        System.err.println("msg");
    }
}
class DisplayMessage implements Message{
    @Override
    public void displayMsg() {
        System.out.println("Hello from displayMsg");
    }
}
public class MainInter {
    public static void main(String[] args) {
        DisplayMessage msg = new DisplayMessage();
        msg.displayMsg();
        msg.display("Hello from default method");
        Message.displayInfo();
    }
}