package ShapeInterface;

public class Rectangle implements GeometricShapes {
	private float Length;
	private float Width;
	private String Name;

	
	public Rectangle(float length, float width) {
		this.Length = length;
		this.Width = width;
		this.Name = "Rectangle";
	}
	
	public float getArea() {
		return this.Length*this.Width;
	}
	
	public String getNames() {
		return this.Name;
	}
	
	public void PrintInfo() {
		System.out.println("This shape is a "+this.getNames());
		System.out.println("It's Area is "+this.getArea()+"\n");
	}
}
