package chainOfResposibility;

public class MultiplyNumbers implements Chain {

private Chain nextInChain;
	
	public void setNextChain(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void calculate(Numbers requests) {
		
		if(requests.getcalculationWanted() == "Multiply") {
			
			System.out.println(requests.getNumber1() + " x " + requests.getNumber2() + " = " + (requests.getNumber1() * requests.getNumber2()));
		}
		else {
			nextInChain.calculate(requests);
		}

	}

}
