package fundamentals;

public class BoxTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Box[] boxes = new Box[5];
//		
//		boxes[0] = new Box(15.0, 26.0, 12.0);
//		boxes[1] = new Box(150.0, 120.0, 260.0);
//		boxes[2] = new Box(1.2, 1.5, 2.6);
//		boxes[3] = new Box(15.0,16.0,14.0);
//		boxes[4] = new Box(12.26,14,45);
		
		Box[] boxes = {
				new Box(15.0, 26.0, 12.0),
				new Box(150.0, 120.0, 260.0),
				new Box(1.2, 1.5, 2.6),
				new Box(),
			 	new Box(12.26,14,45)
		};
		
//		for (Box box : boxes) {
//			System.out.printf("Box [height: %8.2f, width: %8.2f, depth: %8.2f, volume: %10.2f]\n"
//					,box.height,box.width,box.depth,box.volume());
//		}
		
		for (Box box : boxes) {
			System.out.println(box);
		}

	}

}
