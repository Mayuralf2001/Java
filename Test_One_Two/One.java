package fundamentals;

//We cannot inherit the final class
public class One {
	int value;
	final int value1 = 4;	//final value is constant
	
	One(int radius){
		super();
	}
	
	void show() {
		System.out.println("Show in One");
	}
}
