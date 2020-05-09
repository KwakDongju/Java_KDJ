class Point{
	private int x,y,z;
	Point() {}
	Point(int x, int y, int z) { this.x = x; this.y = y; this.z = z; }
	public String toString() { return "(" + x + "," + y + "," + z + ")의 점"; }
	protected void moveUp() { z++; }
	protected void moveDown() { z--; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
	protected void move(int x, int y, int z) { this.x = x; this.y = y; this.z = z;}
}

public class Point3D extends Point {
	Point3D(int x, int y, int z) { super(x,y,z); }

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");	
	}
}