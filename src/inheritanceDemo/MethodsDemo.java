package inheritanceDemo;

public class MethodsDemo {
	//method without return value
	public void login()
	{
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("sign into mailbox");
	}
	public void composeEmail()
	{
		System.out.println("compose email");
	}
	public void logout()
	{
		System.out.println("click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo obj=new MethodsDemo();
		obj.login();
		obj.composeEmail();
		obj.logout();

	}

}
