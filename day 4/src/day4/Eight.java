package day4;
abstract class Animals{
	public abstract void cats();
	public abstract void dogs();
	
}
class Cats extends Animals{
	public void cats() {
		System.out.println("Cats meow");
	}
	public void dogs() {}
}
class Dogs extends Animals{
	public void dogs() {
		System.out.println("Dogs bark");
		}
	public void cats() {}
}
public class Eight {

	public static void main(String[] args) {
		Animals obj1=new Cats();
		Animals obj2=new Dogs();
		obj1.cats();
		obj2.dogs();
		// TODO Auto-generated method stub

	}

}
