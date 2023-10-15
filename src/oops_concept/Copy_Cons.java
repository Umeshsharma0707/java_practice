package oops_concept;

class Employee{
	int id;
	String name;
	long salary;
	
		public Employee() {
			
		}
	
		public Employee(Employee e2) {
			System.out.println("this is const");
			this.id = e2.id;
			this.name = e2.name;
			this.salary = e2.salary;
			printInfo();
			
		}
		
		public void printInfo(){
			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
		}
}

public class Copy_Cons {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 15;
		e1.name = "umesh";
		e1.salary = 50000l;
		e1.printInfo();
		
		e1.id = 16;
		Employee e2 = new Employee(e1);
		
		
		
	
	}	
}
