/*Write a program to Find the Largest Among Three Numbers*/

import java.util.Scanner; 
public class LargestNumberExample1 
{ 
public static void main(String[] args) 
{ 
int n1, n2, n3, largest, temp; 
//object of the Scanner class 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the first number:"); 
n1 = sc.nextInt(); 
System.out.println("Enter the second number:"); 
n2 = sc.nextInt(); 
System.out.println("Enter the third number:"); 
n3 = sc.nextInt(); 
if( n1 >= n2 && n1 >= n3)
 System.out.println(n1 + " is the largest number.");
else if (n2 >= n1 && n2 >= n3)
 System.out.println(n2 + " is the largest number.");
else
 System.out.println(n3 + " is the largest number.");
}
}