//Program to demonstrate abstraction
package oops_abstraction;

public class SquareRoid extends Shapess{
	private float side;
	public SquareRoid()
	{
		side=2.0f;
	}
	public SquareRoid(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}
}

