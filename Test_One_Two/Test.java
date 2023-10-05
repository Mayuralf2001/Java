package fundamentals;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one = new One(1);
		Two two = new Two(2);
		System.out.println("Value: " + one.value);
		System.out.println("Final  Value is  always constant:  " + one.value1);
		
//		one.show();
		two.show();
	}

}
