package Cappgday2;

public class Natural {

	public static void main(String[] args) {
//		4. Write a program to print first 10 natural numbers
//		5. Write a program to print first 10 natural numbers in reverse order
//		6. Write a program to print first 10 even natural numbers
		//-------------------
		System.out.println("Output of program 4.");
		for (int i=0;i<11;i++) {
			System.out.println(i);
		}
		//--------------------
		System.out.println("Output of program 5.");
		for (int i=0;i<20;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
		//----------------------
		System.out.println("Output of program 6.");
		for (int i=20;i>0;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
