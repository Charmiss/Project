/*Write a program to input 2 numbers. If the first number is greater ,then display 
the square of the smaller number and cube of the greater number otherwise viceversa. If the numbers are equal , display message "BOTH NUM*/
import java.util.Scanner;
public class CompareNumbers {
 public static void main(String[] args)
{
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the first number: ");
 double number1 = scanner.nextDouble();
 System.out.print("Enter the second number: ");
 double number2 = scanner.nextDouble();
 if (number1 > number2)
 {
 double smallerNumberSquare = number2 * number2;
 double greaterNumberCube = Math.pow(number1, 3);
 System.out.println("Square of the smaller number: " + smallerNumberSquare);
 System.out.println("Cube of the greater number: " + greaterNumberCube);
 } 
 else if (number2 > number1) {
 double smallerNumberSquare = number1 * number1;
 double greaterNumberCube = Math.pow(number2, 3);
 System.out.println("Square of the smaller number: " + smallerNumberSquare);
 System.out.println("Cube of the greater number: " + greaterNumberCube);
 }
 else
 {
 System.out.println("BOTH NUMBERS ARE EQUAL");
 } 
 } 
 }