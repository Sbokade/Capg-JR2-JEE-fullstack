package Capgday3;

public class Person {
	String name;
	int age;
	String city;

	public Person(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}
	void displayedit() {
		System.out.println("Name of the user: "+name);
		System.out.println("Age of this user: "+age);
		System.out.println("Resident of: "+city);
		
	}
	String vote() {
		if (age>18)
			return"Eligible to vote out ;)";
		else
			return"You gotta wait to vote";
			
	}

	public static void main(String[] args) {
		Person p=new Person("David",29,"Manhattan");
		p.displayedit();
		System.out.println(p.vote());
		

	}

}
