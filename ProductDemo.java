
import javax.lang.model.util.ElementScanner14;

class Product
{
    int pcode;
    String pname;
    double price;
    double lowest;
    Product(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
    }
    void findlowest(double price1,double price2,double price3)
    {
        if(price1<=price2&&price1<=price3)
        {
            System.out.println("\n Product 1 is of the lowest price!");
        }
        else if(price2<=price1&&price2<=price3)
        {
            System.out.println("\n Product 2 is of the lowest price!");
        }
        else
        {
            System.out.println("\n Product 3 is of the lowest price!");
        }
    }
}
public class ProductDemo
{
    public static void main(String[] args) {
        {
            Product obj1=new Product(101,"product-1",100.0);
            Product obj2=new Product(102,"product-2",128.40);
            Product obj3=new Product(103,"product-3",790.00);
            System.out.println("product information");
            System.out.println("-------");
            System.out.println("product_code \t product_name \t product_price");
            obj1.display();
            obj2.display();
            obj3.display();
            obj1.findlowest(obj1.price,obj2.price,obj3.price);
        }
    }
}