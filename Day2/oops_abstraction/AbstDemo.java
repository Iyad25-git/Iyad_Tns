//Program to demonstrate abstraction
package oops_abstraction;


public class AbstDemo {

	public static void main(String[] args) {
		SquareRoid sq=new SquareRoid();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Shapess shape;
		shape=new SquareRoid(12.5f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new Rectangle(10,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
		
		
		
		
		

	}

}
