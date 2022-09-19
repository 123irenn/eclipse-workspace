package intf;
interface language{
	void getName(String name);
}


public class Intfstring implements language {
	public void getName(String name)
	{
		System.out.println("Language used "+name);
	}
	

	public static void main(String[] args) {
		Intfstring obj=new Intfstring();
		obj.getName("python/java");
		// TODO Auto-generated method stub

	}

}
