package main;

public class NumericTestRun {
	public static void main(String[] arg) {
		NumericTest isEven = (n) -> (n%2==0);
		NumericTest isNegative = (n) -> (n<0);
		
		System.out.println(isEven.numberTest(7));
		System.out.println(isNegative.numberTest(-5));
		
		myGreeding mg = (name) -> "Hi " + name + "!";
		System.out.println(mg.proceedName("Rubel "));
		
		myGreeding Mg = (str) -> "Good " + str ;
		System.out.println(Mg.proceedName("Afternoon "));
	}

}
