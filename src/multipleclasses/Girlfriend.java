package multipleclasses;

public class Girlfriend{
	public Girlfriend(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	public void say() {
		System.out.println("your first girlfrind name is: "+getName());
	}
}
