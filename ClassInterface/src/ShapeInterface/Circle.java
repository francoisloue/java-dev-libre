package ShapeInterface;

public class Circle implements GeometricShapes {
	private float Radius;
	private String Name;
	
	public Circle(float radius) {
		this.Name = "Circle";
		this.Radius = radius;
	}
	public String getNames() {
		return this.Name;
	}
	public float getArea() {
		return (float) ((2*Math.PI)*this.Radius);
	}
	
	public void PrintInfo() {
		System.out.println("This shape is a "+this.getNames());
		System.out.println("It's Area is "+this.getArea()+"\n");
	}
}
