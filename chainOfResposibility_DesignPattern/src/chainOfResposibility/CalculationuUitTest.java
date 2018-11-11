package chainOfResposibility;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationuUitTest {

	@Test
	void test() {
		Chain chaincalc1 = new AddNumbers();
		Chain chaincalc2 = new SubNumbers();
		Chain chaincalc3 = new MultiplyNumbers();
		Chain chaincalc4 = new DivideNumbers();
		
		chaincalc1.setNextChain(chaincalc2);
		chaincalc2.setNextChain(chaincalc3);
		chaincalc3.setNextChain(chaincalc4);
		
		Numbers request = new Numbers(4,2,"Add");
		chaincalc1.calculate(request);
		//assertEquals(6,chaincalc1.calculate(request), " ");
		
	}
		
}

