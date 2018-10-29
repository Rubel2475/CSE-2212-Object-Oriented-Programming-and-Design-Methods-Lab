package main;

import java.util.*;
import java.util.Scanner;


/**
 * <h1>Simple caclculator Operation</h1>
 * The simple calculator program implements an application 
 *  that performs add,subtract,multiple,divide and print the
 *  output on the screen.
 * 
 * @author Rubel Hossan
 * @version 1.0
 * @since 2018-10-29
 */


public class Calculator{
	
	/**
	 * this method is used to add two integer.
	 * this is the simplest form of a class method, just to show
	 *  the usage of various javadoc Tags.
	 * @param num1 this is the first parameter to add method 
	 * @param num2 this is the second parameter to add method 
	 * @return this is returns the sum of num1 and num2
	 */
	public static int add(int x, int y){
        int result = x + y;
        return result;
    }
	
		
	/**
	 * this method is used to subtract two integer.
	 * this is the simplest form of a class method, just to show
	 *  the usage of various javadoc Tags.
	 * @param num1 this is the first parameter to add method 
	 * @param num2 this is the second parameter to add method 
	 * @return this is returns the subtracted value of num1 and num2
	 */
	public static int sub(int x, int y){
        int result = x-y;	       
        return result;
	}
	
	
	/**
	 * this method is used to multiple two integer.
	 * this is the simplest form of a class method, just to show
	 *  the usage of various javadoc Tags.
	 * @param num1 this is the first parameter to add method 
	 * @param num2 this is the second parameter to add method 
	 * @return this is returns the multiplicated value of num1 and num2
	 */
	public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
	
	/**
	 * this method is used to divide two integer.
	 * this is the simplest form of a class method, just to show
	 *  the usage of various javadoc Tags.
	 * @param num1 this is the first parameter to add method 
	 * @param num2 this is the second parameter to add method 
	 * @return this is returns the divided value of num1 and num2
	 */
	 
	public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");

        }
        
	}
	
}
