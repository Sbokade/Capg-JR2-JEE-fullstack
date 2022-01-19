package capgemini.task1;

import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		double r, are;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius");
		r = sc.nextInt();  
		
		are= 3.14*r*r;
		System.out.println("Area of circle is"+are);
		
	}
	

}
