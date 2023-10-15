package oops;
class A{
	int a;
		public void a() {
			a =5;
			System.out.println(a);
		}
}
class B extends A {
	int a = 10;
		public void b() {
			a = 5;
			System.out.println(a);

		}
}
class C extends A{
	
	public void c() {
		a = 4;
		System.out.println(a);
	}
}
public class Hierarchial_Inheritance {
	public static void main(String[] args) {
		C c = new C();
		c.a();
	}
}

