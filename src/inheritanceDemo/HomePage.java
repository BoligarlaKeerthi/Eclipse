package inheritanceDemo;

public class HomePage extends Base {
	//child class
public void homepagetest()
{
	System.out.println("test for home page");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage obj=new HomePage();
		obj.openbrowser("chrome");
	       login("admin","admin");
		obj.homepagetest();
		obj.logout();

	}

}
