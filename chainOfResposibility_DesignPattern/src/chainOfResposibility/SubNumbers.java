package chainOfResposibility;

public class SubNumbers implements Chain {

private Chain nextInChain;
	
	public void setNextChain(Chain nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void calculate(Numbers requests) {
		
		if(requests.getcalculationWanted() == "Sub") {
			
			System.out.println(requests.getNumber1() + " - " + requests.getNumber2() + " = " + (requests.getNumber1() - requests.getNumber2()));
		}
		else {
			nextInChain.calculate(requests);
		}

	}
}
