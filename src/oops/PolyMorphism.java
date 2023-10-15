package oops;



/** poly means many
	 *Morphism means forms
	 *two types: 1) overloding - compile time 2) overriding - runtime
	 */

// overloding method example
class a{
	String name;
	int id;
	public void printInfo() {
		System.out.println("default method ");
		System.out.println("Name : " + this.name );
		System.out.println("Id :" + this.id);
	}
	public void printInfo(int id) {
		System.out.println("id Parameterized method ");
		this.id = id;
		System.out.println("Id :"+id);
	}
	public void printInfo(float id) {
		System.out.println("float Parameterized method ");
		
		System.out.println("Id :"+id);
	}
	public void printInfo(String name) {
		System.out.println("name Parameterized method ");
		this.name = name;
		System.out.println("Name :" + name);
	}
	
}
public class PolyMorphism {
	public static void main(String args[]) {
		a obj = new a();
		
		  obj.name = "umesh";
		  obj.id = 2;
		  
		  obj.printInfo();
		
	}
}
