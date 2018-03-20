
public class Student {

	private int id;
	private String name;

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Two students are equal if their id and name are equal.
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		if (obj == this)
			return true;
		return this.getId() == ((Student) obj).getId();
	}

	@Override
	public int hashCode() {
		return id;
	}

	public static void main(String[] args) {
		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");
		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
	}

}
