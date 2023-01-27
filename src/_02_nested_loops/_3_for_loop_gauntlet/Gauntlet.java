package _02_nested_loops._3_for_loop_gauntlet;

public class Gauntlet {
public static void main(String[] args) {
	Gauntlet g = new Gauntlet();
	g.taskSeven();
}
	
	void taskOne() {
		
		///PROJECT ONE(display all numbers from 1 to 100)
				for (int i = 0; i < 101; i ++) {
					System.out.println(i);
				}
		
	}
	
	void taskTwo(){
	/// PROJECT TWO( Display all numbers from 100 to 0)	
	for(int i = 100; i >0; i--) {
		System.out.println(i);
	}
	}
	
	void taskThree() {
		/// PROJECT THREE(Display all even numbers from 2 to 100)
		for (int i = 2; i < 101; i++) {
			if (i % 2 ==0) {
				System.out.println(i);
			}
		}
		
	}
	
	void taskFour() {
		///PROJECT FOUR(Display all odd numbers from 1 to 99)
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	void taskFive() {
		///PROJECT FIVE(Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.)
		
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println("this number is even: " + i);
			}
			if (i % 2 == 1) {
				System.out.println("this number is odd: " + i);
			}
		}
	}
	
	void taskSix() {
		///PROJECT SIX( Display all multiples of 7 from 0 to 777.)
		for(int i = 7; i < 777; i += 7) {
			System.out.println(i);
		}
	}
	
	void taskSeven() {
		///PROJECT SEVEN(Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person))
		for(int i = 2012; i < 2024; i++) {
			int age = i - 2012;
			System.out.println("in the year " + i + " I was "+age + " years old.");
		}
	}
}
	
