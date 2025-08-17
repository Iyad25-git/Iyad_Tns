//Program to demonstrate Hierarchical Inheritance - Person Class
package inheritance.hierarchicalinheritance;

public class Persona {
	private String name;
	private String city;

	public Persona() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="Pune";
	}

	public Persona(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	

}
