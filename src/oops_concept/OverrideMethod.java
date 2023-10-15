package oops_concept;

class Calc{
	public int add(int a , int b ) {
		return a + b;
	}
	public void config() {
		System.out.println("in a config");

	}
}
class AdvCalc extends Calc{
	
	public int add(int a, int b) {
		
		return a + b + 1;
	}
}

public class OverrideMethod {
	
	public static void main(String[] args) {
		
		AdvCalc ac = new AdvCalc();
		
		System.out.println(ac.add(3, 5));
		
	}
}
