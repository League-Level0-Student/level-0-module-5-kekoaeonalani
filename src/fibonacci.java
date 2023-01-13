
public class fibonacci {
public static void main(String[] args) {
	
	int number1 = 0;
	int number2 = 1;
	int sum = 1;
	
	for(int i = 0; i<10; i++) {
		
		sum = number1 + number2;
		number1 = number2;
		number2 = sum;
		System.out.println(""+sum+"");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
