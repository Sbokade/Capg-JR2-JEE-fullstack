package Cappgday2;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// Write a program to display the factorial of numbers from 1 to the input number?
//		   Take input using scanner? Also display if the factorial is a prime number or not?
//		9. Write a program to find whether the given number is prime or not.
    int i,n,sum=1;
	Scanner sc= new Scanner(System.in);
    System.out.println("please enter a number");
    n=sc.nextInt();
    for (i=1;i<n;i++) {
    	sum=sum*i;
    	
    }System.out.println("Sum of factorial is"+sum);
    boolean flg=false;
    for (i=2;i<(n/2)+1;++i) {
    	if(n%i==0) {
    		flg=true;
    		break;
    		
    	}
    }if(!flg)
    	System.out.print(n+"Prime");
    else
    	System.out.print(n+"Not Prime");
    
    
	}

}
