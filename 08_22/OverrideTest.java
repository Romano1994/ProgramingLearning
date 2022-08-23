class Point3{
	int x;
	int y;
	String getLocation() {
		return "x :" +x+ "y : "+y;
	}
}

class Point3D extends Point{
	int z;
	String getLocation() {
		return "x :" +x+ "y : "+y+ "z :" +z;
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		Point3D point3d = new Point3D();
		point3d.x = 1;
		point3d.y = 1;
		point3d.z = 1;
		
		point3d.getLocation();
	}
}
