package Question7_main;

import java.util.Scanner;

public class TicketSeller {

	public static int N=100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(N>0) {
			System.out.print("Number of tickets want to buy: ");
			n=sc.nextInt();
			N=BuyTicket(n);
			System.out.println("Number of remaining tickets : "+ N);
		}
		System.out.println("Sorry, Here no more ticket available.");
	}
	public static int BuyTicket(int NumOfTicket )
	{
		if(NumOfTicket>20) {
			NumOfTicket=20;
		}
		if(NumOfTicket>N)
			NumOfTicket=N;
		N-=NumOfTicket;
		
		return N;
	}

}
