import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Enter a number...");
	int num = Integer.parseInt(number);
	
	boolean isPrime = true;
for (int i = 2; i <= Math.sqrt(num); i ++) {
	if (num % i == 0) {
		isPrime = false;
		JOptionPane.showMessageDialog(null, " " + num + " is not prime!");
	}
	
	}
if (isPrime == true) {
	JOptionPane.showMessageDialog(null, " " + num + " is prime!");
}
	
	
	
	
}
}
