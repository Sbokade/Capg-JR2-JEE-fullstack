package Capgday3;

class Books {
	int  pages;
	String distributer;
	String name;
	String writer;
	//double price;
	double marketpercentage;
	String sales;
	
	

	public Books(int pages, String distributer, String name, String writer,  double marketpercentage,
			String sales) {
		super();
		this.pages = pages;
		this.distributer = distributer;
		this.name = name;
		this.writer = writer;
		//this.price = price;
		this.marketpercentage = marketpercentage;
		this.sales = sales;
	}
	
	void displayedit() {
		System.out.println("Name of the Book is "+name);
		System.out.println("It is available in market and is distributed by "+distributer);
		System.out.println("One of the most classic edition released by "+writer);
		System.out.println("With a in depth reading experience in "+pages+" pages");
		System.out.println("Already becoming the most popular and best seller according to sales of "+sales);
		System.out.println("That is about "+marketpercentage+" % of worldwide sale. With such a huge number of sale "+writer+" is already generating billions of dollars($).");
	}
	int rate() {
		if (distributer=="USA")
			return 430;
		else if(distributer=="INDIA")
			return 420;
		else if(distributer=="Europe")
			return 429;
		else if(distributer=="Africa")
			return 460;
		else if(distributer=="Australia")
			return 470;
		else if(distributer=="Online")
			return 520;
		else
			return 500;
		
	}



	public static void main(String[] args) {
		Books right=new Books(550,"USA","My Life Story","Manjusha Bokade",89.00,"90+ Million and still counting");
		right.displayedit();
		System.out.println("Your payable amount for the book is: "+right.rate()+"$");
	}

}
