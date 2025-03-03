/*Write a program to generate following pattern.
1
12
123
1234
12345
*/

public class Pattern1 
{ 
public static void main(String args[]) 
{ 
int i, j,number, n=5; 
//loop for rows 
for(i=1; i<=n; i++) 
{ 
//loop for columns 
for(j=1; j<=i; j++) 
{ 
//prints num 
System.out.print(j+ " "); 
} 
System.out.println(); 
} 
} 
}


