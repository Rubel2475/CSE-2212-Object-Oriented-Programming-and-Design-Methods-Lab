package stream;

public class main {

	public static void main(String[] args) {
		
		howManyThe the = new howManyThe();
		
		System.out.println("1. : " + the.counter());
		howManyThe2 the2 = new howManyThe2();
		System.out.println("2. : " + the2.counter());
		 
		System.out.println("3. : " );
		new howManyThe3().print();
		System.out.print("4. : ");
		new FourLetter().distinct();
		
		
	}

}