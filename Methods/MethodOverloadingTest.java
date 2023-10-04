package fundamentals;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading object1 = new MethodOverloading();
		MethodOverloading object2 = new MethodOverloading();
		MethodOverloading object3 = new MethodOverloading();
		
		object1.display(15,30);
		
		object2.display();
		
		System.out.println(object3.display(10));
	}

}
