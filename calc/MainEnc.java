
import java.util.ArrayList;

class Product{
    private int pid;
    private String productName;
    private double price;
    private int quantity;

    public Product(int pid, double price, String productName, int quantity) {
        super();
        this.pid = pid;
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public String getProductName() {
        return productName;
    }

}
public class MainEnc {
    public static void main(String[] args) {
        ArrayList<Product> arr=new ArrayList<Product>();
        

             arr.add(new Product(1,20000,"Mobile",10));
             arr.add(new Product(1,200000,"Laptop",10));
             arr.add(new Product(1,1000,"mic",10));
             arr.add(new Product(1,2000,"keyboard",10));
             arr.add(new Product(1,200,"Mouse",10));
           System.out.println("Product ID\tProduct Name\tPrice\tQuantity");
           for(Product p1:arr){
            String result=String.format("%d\t\t%s\t\t%s\t\t%d", p1.getPid(), p1.getProductName(), p1.getPrice(), p1.getQuantity());
           System.out.println(result);
           }

    }
}