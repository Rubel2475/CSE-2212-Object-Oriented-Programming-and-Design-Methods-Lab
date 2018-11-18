package main;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element :");
		int num = sc.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the element :");
		for (int i = 0; i < num; ++i) {
			array[i]=sc.nextInt();

		}
		System.out.println(" number are :");
		for(int elements :array) {
			System.out.println(elements);
		}

	}
}
