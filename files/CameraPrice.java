/*A shopkeeper offers 10% discount on the printed price of a mobile phone. 
However, a customer has to pay 9% GST on the remaining amount. Write a 
program in Java to calculate the amount to be paid by the customer taking 
printed price as an input.
*/
import java.util.*;
public class CameraPrice
{
public static void main(String args[]) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter printed price of Digital Camera:");
double mrp = in.nextDouble();
double dis = mrp * 10 / 100.0;
double price = mrp - dis;
double gst = price * 9 / 100.0;
price = price+gst;
System.out.println("Amount to be paid= " + price);
}
}