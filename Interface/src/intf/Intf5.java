package intf;
interface Drawe{
	void Draw();
	
		static int cube(int x)
		{
			return x*x*x;
		}
	
}
class abc implements Drawe{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}
}

public class Intf5 {

	public static void main(String[] args) {
		Drawe d=new abc();
		d.Draw();
		System.out.println(Drawe.cube(3));
		// TODO Auto-generated method stub

	}

}
