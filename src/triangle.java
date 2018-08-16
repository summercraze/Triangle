
public class triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public triangle()
	{
		
	}
	public triangle(double side1, double side2,double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public triangle(double side1, double side2,double side3,String color, boolean filled)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	public double getSide1()
	{
		return side1;
	}
	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	public double getSide2()
	{
		return side2;
	}
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	public double getSide3()
	{
		return side3;
	}
	public void setSide3(double side3)
	{
		this.side3 = side3;
	}
	@Override
	public double getArea() {
		double p = this.getPerimeter()/2.0;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nPerimeter : " + this.getPerimeter() + "\nArea : " + this.getArea();
	}

}
