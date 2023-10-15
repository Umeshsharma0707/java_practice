package oops;

class Account{
	int ac_no; 
	String name;
	private String password;
	
		public String getPassword() {
			return this.password;
		}
		public void setPassword(String pass) {
			this.password = pass;
			
		}
}

public class GettersAndSetters {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.ac_no = 45621846;
		ac.name = "umesh";
		System.out.println("Account No : "+ ac.ac_no);
		System.out.println("Name :" + ac.name);
		ac.setPassword("abcd1234");
		
		System.out.println("Password : " + ac.getPassword());
	}
}
