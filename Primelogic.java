package Cappgday2;
import java.util.Scanner;
public class Primelogic {
	public static void main(String[] args) {
//		Write a program to find whether the given number is prime or not.
//		10. Write a program to print prime numbers between 2 to 100
		int i, n;boolean flg=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		for(i=2;i<=(n/2);++i) {
			if(n%i==0) {
				flg=true;
				break;
			}}
	if (!flg) 
		System.out.println("Prime");
    else 
	    System.out.println("Not Prime");
		}}