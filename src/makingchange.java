import javax.swing.JOptionPane;

public class makingchange {

	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog(null, "Enter an amount. "
				+ "Use dollars and cents. \nExample: 1.56");
		double num = Double.parseDouble(input);
		// JOptionPane.showMessageDialog(null, "You entered" + num);
		
		int cents = (int) (num * 100); 
		int nickles = cents/5; 
		int pennies = cents - nickles * 5;
		
		JOptionPane.showMessageDialog(null, num + "is " + nickles + "nickels " + pennies + "pennies )");
		
		
	
		

	}

}
