package ShapeInheritance;

public class Rectangle extends GeometryShapes{
	private float Length;
	private float Width;

	
	public Rectangle(float length, float width) {
		this.Length = length;
		this.Width = width;
		this.Name = "Rectangle";
	}
	
	public float Area() {
		return this.Length*this.Width;
	}
	
	public void PrintInfo() {
		System.out.println("This shape is a "+this.Name);
		System.out.println("It's Area is "+this.Area()+"\n");
	}
}
