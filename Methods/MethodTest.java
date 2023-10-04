package fundamentals;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Methods calc = new Methods();
//		calc.display();
		
		System.out.println("Static method output : ");
		Methods.display();
		System.out.println("Sum : " + Methods.sum(10, 10));
		System.out.println("Product : " + Methods.product(10, 20));
	}

}
