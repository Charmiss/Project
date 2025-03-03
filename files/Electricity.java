/*An Electricity Board charges for electricity per month from their consumers according to 
the units consumed. The tariff is given below:
Units Consumed Charges
Up to 100 units ₹1.80/unit
More than 100 units and up to 300 units ₹2.30/unit
More than 300 units and up to 400 units ₹2.80/unit
More than 500 units ₹3.50/unit
Write a program to calculate the electricity bill taking consumer's name and units 
consumed as inputs. Display the output.*/

import java.io.*;
public class Electricity
{
public static void main(String args[])throws IOException
{
InputStreamReader read= new InputStreamReader(System. in);
BufferedReader in= new BufferedReader(read);
String name,mt;
int cn,u;
double p=0.0;
System.out.println("Enter consumer name");
name=in.readLine();
System.out.println("Enter consumer number");
cn=Integer.parseInt(in.readLine());
System.out.println("Enter the month");
mt=in.readLine();
System.out.println("Enter the units consumed");
u=Integer.parseInt(in.readLine());
if(u<=100)
p=u*1.80;
if(u>100&&u<=300)
p=u*2.30;
if(u>300&&u<=500)
p=u*2.80;
if(u>500)
p=u*3.50;
System.out.println("Consumer name:"+name);
System.out.println("Enter consumer number:"+cn);
System.out.println("Electricity bill for the month:"+mt);
System.out.println("Units consumed:"+u);
System.out.println("Amount to be paid:"+p);
}
}

