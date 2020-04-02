package org.test;

public class MethodOverloading {
private void employeeDetails(Integer id,String name ) {
	System.out.println("employee id and name are:"+id+" "+"and"+" "+name);
	}
private void employeedetails(long l) {
	System.out.println("employee phone number is:"+" "+l);
}
private void employeedetails(float f) {
	System.out.println("employee salary is:"+" "+f);
}

public static void main(String[] args) {
	MethodOverloading m = new MethodOverloading();
	m.employeeDetails(234, "shaji");
	m.employeedetails(9176552234l);
	m.employeedetails(5078.765f);
	
	
}
}
