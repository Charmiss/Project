/*Write a program in Java to accept the number of days and display it after 
converting it into number of years, month & days.*/
import java.util.Scanner;
public class DaysToYear
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Convert Days to Number of Years");
System.out.println("--------------------------------");
int balance, years, months, days;
System.out.print("Enter total days: ");
int numberOfDays = sc.nextInt();
years = numberOfDays / 365;
balance = numberOfDays % 365;
months = balance / 30;
days = balance % 30;
System.out.println("In years");
System.out.println("----------");
System.out.println("Number of years: " + years);
System.out.println("Number of months: " + months);
System.out.println("Number of days: " + days);
}
}
