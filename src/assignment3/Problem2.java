package assignment3;

public class Problem2 {
	public static void employeeInfo(String name,int age,double salary,String address){
		name=name;
		System.out.println("NAME - "+name + ", " +"AGE - "+ age + ", "+"SALARy - "+ + salary + ", "+"Address - " + address);
	}

	public static void main(String[] args) {
		/* 2.    Write a java program which will 
		display 5 employee information(name, age, salary and address).*/
		employeeInfo("sagor",30,2000.25,"nevada,mo");
		employeeInfo("semee",30,2100.25,"Dhaka,BD");
		employeeInfo("Tonima",10,102000.25,"Santa clara,ca");
		employeeInfo("Tani",35,1000.25,"Dhaka,BD");
		employeeInfo("saai",30,300.25,"Arlington,tx");

	}

}
