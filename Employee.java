package Capgday3;

class Emp{
	String name;
	int id;
	String dept;
	double salary;
	int present;
	double salaryperday;
	
	void displayfixed() {
		System.out.println("Name of the employee is: "+name);
		System.out.println("Employee "+name+ " belongs to "+dept);
		System.out.println("ID is "+id);
		System.out.println("Number of working days recorded "+present);
		System.out.println("Basic pay"+salary);
	}
	
	void Calcsalary() {
		salaryperday=salary/22;
		System.out.println("Salary per day: "+salaryperday);
		if (present<22)
			System.out.println("Basic pay only/-");
		else {
			double hike;
			hike=0.10*salary+salary;
			System.out.println("10% hike");
			System.out.println("Payable salary amount after hike: "+hike);
		}
		
		
	}}
public class Employee {

	public static void main(String[] args) {
		Emp r= new Emp();
		Emp s=new Emp();
		
		r.dept="IT";
		r.id=4584;
		r.name="Raj Malhotra";
		r.present=19;
		r.salary=45000;
		
		r.displayfixed();
		r.Calcsalary();
		//		System.out.println(r.Calcsalary());
		System.out.println();
		System.out.println("--------ctc---------");
		System.out.println();
		
		s.dept="CT";
		s.id=9091;
		s.name="Swarali Bokade ";
		s.present=22;
		s.salary=99000;
		
		s.displayfixed();
		s.Calcsalary();
//		System.out.println(s.Calcsalary());
		System.out.println("------------ctc-------------");

	}

}
