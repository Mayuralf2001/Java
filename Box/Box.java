package fundamentals;

public class Box {
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + ", volume()=" + volume() + "]";
	}
	double height;
	double width;
	double depth;
	
	//Constructor: Assigning values to the members of the class during instantiation itself
	Box(double height, double width, double depth){
		this.height = height;	//this is implict obect of class itself
		this.width = width;
		this.depth = depth;
	}
	
	//Constructor overloading
	Box(){}		//No Argument
	
	Box(double value){
		height = width = depth = value;
	}
	double volume(){
		return height * width * depth;
	}
}
