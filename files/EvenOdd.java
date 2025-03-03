/*Write a program to input a number. Display all the digits of a number stating 
whether it is an even number or odd number using do while loop*/

import java.util.Scanner;
public class EvenOdd 
{
 public static void main(String[] args)
{
 Scanner reader = new Scanner(System.in);
 int rem;
 System.out.print("Enter a number: ");
 int num = reader.nextInt();
 while(num!=0)
 {
 rem=num%10;
 if(rem % 2 == 0)
 System.out.println(rem + " is even");
 else
 System.out.println(rem + " is odd");
 num=num/10;
 }
}
}
