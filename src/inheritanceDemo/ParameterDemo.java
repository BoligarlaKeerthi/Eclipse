package inheritanceDemo;

public class ParameterDemo {
	

	public void login(String username,String password)
	{
		System.out.println("enter username :" +username);
		System.out.println("enter password :" +password);
		System.out.println("sign into mailbox");
	}
	public void composeEmail(String text)
	{
		System.out.println("compose email with text:" +text);
	}
	public void logout()
	{
		System.out.println("click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      ParameterDemo obj=new ParameterDemo();
		obj.login("keerthi","admin@123");
		obj.composeEmail("good morning");
		obj.logout();

	}

}

	


