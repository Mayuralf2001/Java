package fundamentals;

public class BoxTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box[] boxes = new Box[5];
		
//		boxes[0] = new Box();
//		boxes[1] = new Box();
//		boxes[2] = new Box();
//		boxes[3] = new Box();
//		boxes[4] = new Box();
		
		boxes[0].height = 12.0;
		boxes[0].width = 15.0;
		boxes[0].depth = 14.0;
		
		boxes[1].height = 22.0;
		boxes[1].width = 32.0;
		boxes[1].depth = 42.0;
		
		boxes[2].height = 2.0;
		boxes[2].width = 12.0;
		boxes[2].depth = 6.0;
		
		boxes[3].height = 4.0;
		boxes[3].width = 1.0;
		boxes[3].depth = 3.0;
		
		boxes[4].height = 5.0;
		boxes[4].width = 10.0;
		boxes[4].depth = 15.0;
		
		for (Box box : boxes) {
			System.out.printf("Box [height: %8.2f, width: %8.2f, depth: %8.2f, volume: 10.2f]\n"
					,box.height,box.width,box.depth,box.volume());
		}
	}

}
