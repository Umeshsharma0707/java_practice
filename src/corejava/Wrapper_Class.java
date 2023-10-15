package corejava;

public class Wrapper_Class {
			 public static void main(String[] args) {
				
				 byte a = 10;
				 short b = 12;
				 int c = 2000;
				 long d = 200000000l;
				 double e = 20.54465865d;
				 float f = 20.22f;
				 char g = 'j';
				 String h = "java";
				 boolean j = true;
				 
				 System.out.println("wrapper class objects :..........");
				 byte byobj = new Byte(a);
				 System.out.println("byte :" + byobj);
				 
				 short shobj = new Short(b);
				 System.out.println("short :" + shobj);
				 
				 Integer intobj = new Integer(c);
				 System.out.println("integer :" + intobj);
				 
				 Integer intobj1 = new Integer((int)f);
				 System.out.println("integer from float :" + intobj1);
				 
				 
			}
}
