package chainOfResposibility;

public interface Chain {
	
	public void setNextChain(Chain nextchain);
	public void calculate(Numbers requests);
}
