package Lesson29;
import java.util.ArrayList;
import java.util.function.Predicate;



public class HomeWork30 {
public static void main(String[] args) {
Employee emp = new Employee();
Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();
Employee emp4 = new Employee();
ArrayList<Employee> listEmp = new ArrayList<>();
emp.name = "Vasja";
emp.department = "IT";
emp.salary = 300;

emp1.name = "Sale";
emp1.department = "Sale";
emp1.salary = 250;

emp2.name = "July";
emp2.department = "Store";
emp2.salary = 150;

emp3.name = "IT";
emp3.department = "IT";
emp3.salary = 340;

emp4.name = "Elena";
emp4.department = "IT";
emp4.salary = 440;

listEmp.add(emp);
listEmp.add(emp1);
listEmp.add(emp2);
listEmp.add(emp3);
listEmp.add(emp4);



TestEmployee tEmp = new TestEmployee();
 // tEmp.printEmployee(emp1);
 
 
//   for (Employee employee : listEmp) {
   // tEmp.printEmployee(employee);
   // }
System.out.println("( FILTER = all workers salary > 200 )");
tEmp.filtrWorkers(listEmp, (Employee em) -> {return em.salary > 200;});
System.out.println("----------------------");
System.out.println("( FILTER = all workers name starts with 'E' and salary != 450 )");
tEmp.filtrWorkers(listEmp, em -> em.name.startsWith("E") && em.salary != 450);
System.out.println("-----------------------");
System.out.println("( FILTER = all workers name same as department name )");
tEmp.filtrWorkers(listEmp, em -> em.name.equals(em.department));



	
	}
}

class Employee {
	int salary;
	String name;
	String department;
}

class TestEmployee {
	
	public void printEmployee(Employee printEmp){
		System.out.println("name " + printEmp.name + " department " + printEmp.department + " salary " + printEmp.salary);
	}


public void filtrWorkers(ArrayList<Employee> aL, Predicate <Employee> pEmp){
	for (Employee employee : aL) {
		if (pEmp.test(employee)) {
			printEmployee(employee);
		}
		
	}}

	public void filterW(ArrayList<Employee> aL){
		for (Employee employee : aL) {
			System.out.println(employee);
		}

	}
}