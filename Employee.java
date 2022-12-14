package PRACTICEPACKAGE;

import java.util.ArrayList;

public class Employee {
	String firstName;
	String lastName;
	String department;
	
	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}
	
	public static ArrayList<Employee>addEmployees(String[]first,String[]last,String[]depart){
		ArrayList<Employee>employee=new ArrayList<>();
		for(int i=0;i<first.length;i++) {
			Employee em=new Employee(first[i],last[i],depart[i]);
			employee.add(em);
		}
		return employee;
	}
	



	public static void main(String[] args) {
		String[]firstName= {"Patrick","Eric","Claude"};
		String[]lastName= {"Niyibizi","Mugisha","Muhoza"};
		String[]department={"Receivind","Chippin","Driving"};
		
		ArrayList<Employee>employees=new ArrayList<>(addEmployees(firstName,lastName,department));
		System.out.println();
		System.out.println(employees);
	}
	
}


