package inheritanceDemo;

public class Payments extends HomePage {
	//child to HomePage 
	public void payments()
	{
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Payments obj=new Payments();
                 obj.openbrowser("chrome");
                 login("admin","admin123");
                 obj.homepagetest();
                 obj.payments();
                 obj.logout();
	}

}

