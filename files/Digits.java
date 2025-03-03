/*Write a program to check whether an input integer number is a 1 digit,2 digit or a 3-
digit number. If it is one digit then display square, if it is a 2 digit number then display 
square root and for 3-digit display cube root*/

import java.util.*;
public class Digits{
public static void main(String args[]) {
Scanner in =new Scanner(System.in);
int n;
System.out.println("Enter a number");
n= in.nextInt();
if(n>=0 && n<10)
{
System.out.println(" A one digit number");
System.out.println("Square of the number."+(n*n));
}
if(n>=10 && n<100) {
System.out.println("A two digits number");
System.out.println("Square root of the number." + Math.sqrt(n));
}
if(n>=100 && n<1000) {
System.out.println("A three digits number");
System.out.println("Cube root of the number:!"+Math.pow(n,1.0/3.0));
}
if(n>=1000) {
System.out.println("The number entered contains four digits or more");
} } }