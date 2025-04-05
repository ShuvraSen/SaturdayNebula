package encapsulation_abstraction_interface;

public class EncapsulationDemo {
	private String name="upskill";
	private int ssn=123456789;
	private String user_name="Shuvra";
	public void setName(String value){
		name=value;
	}
	
	public String getName(){
		return name;
	}
	public void setssn(int newValue){
		ssn=newValue;
	}
	
	public int getssn(){
		return ssn;
	}
	public void setUserName(String newUser){
		user_name=newUser;
	}
	
	public String getNewUser(){
		return user_name;
	}
	
	public static void main(String[] args) {
	EncapsulationDemo EncapsulationDemoobj= new EncapsulationDemo();
	EncapsulationDemoobj.setName("upskillConsultancy");
	System.out.println(EncapsulationDemoobj.getName());
	//for ssn
	EncapsulationDemoobj.setssn(10000000);
	System.out.println(EncapsulationDemoobj.getssn());
	//user name
	EncapsulationDemoobj.setUserName("Shuvra S Sen");
	System.out.println(EncapsulationDemoobj.getNewUser());

	}

}
/*
Encapsulation hides both data (variables) and methods.
It restricts direct access and allows controlled interaction through getters,
 setters, or public methods. This ensures data integrity and security.
*/