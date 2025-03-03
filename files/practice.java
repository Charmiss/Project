import java.util.*;

public class practice
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter price");
        double mrp=sc.nextDouble();
        double dis=mrp*10/100;
        double price=mrp-dis;
        double gst=price*9/100;
        price=price+gst;
        System.out.println("price is : " +price);
    }
}