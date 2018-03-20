
public class Constr {
	String firstName;
	String lastName;
	String city;
	int pid;
	
  //Default constructor
	Constr(){
		firstName="Rohith";
		lastName="Yeedulapalli";
		city = "Plano";
		pid=12345;
	}
	//parameterized constructor
	Constr(String firstname, String lastname,String city, int personid){
		this.firstName=firstName;
		lastName=lastName;
		this.city = city;
		pid = personid;
	}
	
	Constr(String firstName, String lastName){
	this.firstName=firstName;
	this.lastName = lastName;
	city="Irving";  
	
	}
}
