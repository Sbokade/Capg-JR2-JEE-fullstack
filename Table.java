package Cappgday2;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		int i,n,sum=1;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (i=0;i<n+1;i++) {
			sum=i*n;
			
		System.out.println(n+"x"+i +"is"+sum);
		}
	}
}
