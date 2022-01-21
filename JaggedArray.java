package Capgday3;

public class JaggedArray {

	public static void main(String[] args) {
		String arr[][]= {{"Rohit","Mahi","Suresh"},{"Manish","Taran"},{"Ankit","Mohit","David"}};
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
			}

}
