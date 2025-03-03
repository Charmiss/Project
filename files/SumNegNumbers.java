/*Write a program to accept any 10 numbers. Display the sum of only negative 
numbers.*/

import java.util.Scanner;
public class SumNegNumbers
{
 public static void main(String[] ars)
 {
 int sum=0,num,i=1;
 Scanner input = new Scanner(System.in);
 while(i<=10)
 {
 num=input.nextInt(); //Read number
 if(num<0)
 {
 sum +=num;
 }
 i++;
 }
 System.out.println( "Sum is : " +sum);
 }
}
