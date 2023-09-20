package ShapeInheritance;

public class Circle extends GeometryShapes {
	private float Radius;
	
	public Circle(float radius) {
		this.Name = "Circle";
		this.Radius = radius;
	}
	
	public float Area() {
		return (float) ((2*Math.PI)*this.Radius);
	}
	
	public void PrintInfo() {
		System.out.println("This shape is a "+this.Name);
		System.out.println("It's Area is "+this.Area()+"\n");
	}
}
