package ch7_22;

public class ch7_11 {

	public static void main(String[] args) {

		
	}

}

class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	Point3D(){
		this(z);
	}
}