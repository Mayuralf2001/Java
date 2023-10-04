package fundamentals;

public class MethodOverloading {
	int firstNumber, secomdNumber;
	
	public MethodOverloading() {}
	
	public MethodOverloading(int firstNumber, int secomdNumber) {
		this.firstNumber = firstNumber;
		this.secomdNumber = secomdNumber;
	}

	MethodOverloading(int value){
		firstNumber = secomdNumber = value;
	}
	
	//Method Overloading
	void display() {
		System.out.println("Number [First: " + firstNumber + ", second: " + secomdNumber + "]");
	}
	
	int display(int value) {
		return firstNumber + secomdNumber + value;
	}
	
	void display(int firstValue, int secondValue) {
		System.out.println("Sum : " + (firstValue + secondValue));
	}
}
