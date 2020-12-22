

public class Human {
	protected String name;
	
	public Human(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	void eat() {
		System.out.println(getName() +" eating....");
	}
	
	
	void drink() {
		System.out.println(getName() +" drinking....");
	}
	void walk() {
		System.out.println(getName() +" walking....");
	}
	
	void sit() {
		System.out.println(getName() +" sitting....");
	}
	
	void speak() {
		System.out.println(getName() +" speaking....");
	}
	

}
