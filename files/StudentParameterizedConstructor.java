/*Write a program to create a class “student” store 2 student information using 
parameterized constructor and display the data using member method*/

import java.util.*;
class StudentDetail
{
int Roll,hindi,eng;
String NameID;
StudentDetail(int p, String q, int r, int s)
{
Roll = p;
NameID=q;
hindi=r;
eng=s;
}
void ShowData()
{
System.out.println("Roll Number : "+Roll);
System.out.println("Students Name : "+NameID);
System.out.println("Hindi Marks : "+hindi);
System.out.println("English Marks : "+eng);
}
}
public class StudentParameterizedConstructor
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
String read,Name;
int RollNumber,Hindi,English;
System.out.println("Enter Name of the Student : ");
Name= s.nextLine();
System.out.println("Enter Class Roll Number : ");
RollNumber =s.nextInt();
System.out.println("Enter Hindi Marks : ");
Hindi= s.nextInt();
System.out.println("Enter English Marks : ");
English = s.nextInt();
StudentDetail std= new StudentDetail(RollNumber,Name,Hindi,English);
System.out.println("Details of the Student Entered are :");
std.ShowData();
}
}
