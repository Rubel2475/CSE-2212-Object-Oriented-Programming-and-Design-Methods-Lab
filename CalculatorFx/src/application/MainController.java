package application;

import java.awt.Label;
import java.awt.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class MainController {
	
	@FXML
	private Label result;
	private long number1 = 0;
	private String operator = "";
	private boolean start = true;
	private model modl = new model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		
		if(start) {
			result.setText("");
			start = false;
		}
		
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
		
	}
	
	@FXML
	public void processOperators(ActionEvent event) {
		
		String value = ((Button)event.getSource()).getText();
		
		if(!value.equals("=")){
			if(!operator.isEmpty()) 
				return;
				
				operator = value;
				number1 = Long.parseLong(result.getText());
				result.setText("");
		} else {
			if(operator.isEmpty())
				return;
			
			long number2 = Long.parseLong(result.getText());
			float output = modl.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			start = true;
		}
				
	}

}
