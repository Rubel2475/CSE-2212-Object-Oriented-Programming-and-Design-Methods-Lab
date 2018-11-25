package Question7_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Question7_main.TicketSeller;

class TestTicketSeller {

	@Test
	void test() {
		TicketSeller obj=new TicketSeller();
		
		assertEquals(obj.BuyTicket(10), 90);
		assertEquals(obj.BuyTicket(15), 75);
		assertEquals(obj.BuyTicket(25), 55);
		assertEquals(obj.BuyTicket(5), 50);
		assertEquals(obj.BuyTicket(20), 30);
		assertEquals(obj.BuyTicket(20), 10);	
		assertEquals(obj.BuyTicket(10), 0);
	}

}
