package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class largestInArrayList {

	public static void main(String[] args) {
		ArrayList<Double> values = new ArrayList<Double>();
		System.out.println("Enter Values :");
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNextDouble()) {
			values.add(sc.nextDouble());
		}
		
		double large = values.get(0);
		for(int i=0;i<values.size();i++) {
			if(large<values.get(i)) {
				large=values.get(i);
			}
		}
		
		for(double elements : values) {
			System.out.print(elements);
			if(elements==large) {
				System.out.println("<== Largest values");
			}
			System.out.println();
		}

	}

}
