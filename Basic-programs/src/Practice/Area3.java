package Practice;

import java.util.Scanner;

public class Area3 {
public static void main(String[] args)

{
	System.out.println("Enter the value of a");
	
	Scanner x = new Scanner(System.in);//we take the value from user
	float a = x.nextFloat();
	// double a = 5;

 double eqilateralarea =(double) (1.73*a*a)/4;
 System.out.println(eqilateralarea);
 
 System.out.println("enter the second value");
 float r = x.nextFloat();
 float pi =(float)3.14;
 double ecllipsarea = pi*r*r;
 System.out.println(ecllipsarea);
}
}
