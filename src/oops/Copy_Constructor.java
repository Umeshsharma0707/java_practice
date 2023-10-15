package oops;
import java.util.*;

class Studentss{
	String name;
	int age;
	
	public Studentss(Studentss s2) {
		this.name = s2.name;
		this.age = s2.age;
	}
	
	public Studentss() {
		
	}

	public void studentInfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
}

public class Copy_Constructor {
	 public static void main(String[] args) {
		 Studentss s1 = new Studentss();
		 
		 s1.age = 12;
		 s1.name = "umesh";
		 
		 Studentss s2 = new Studentss(s1);
		 s2.studentInfo();
	}
}
