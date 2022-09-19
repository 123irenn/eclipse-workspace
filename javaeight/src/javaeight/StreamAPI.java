package javaeight;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class employee{
	String name;
	int ID;
	public employee(String name,int ID) {
		super();
		this.name=name;
		this.ID=ID;
	}
}

public class StreamAPI {

	public static void main(String[] args) {
		List<employee> li=new ArrayList<employee>();
		li.add(new employee("Irene",1267));
		li.add(new employee("Akshay",1067));
		li.add(new employee("adwaith",1087));
		li.add(new employee("Krishnapriya",1290));
		Stream<employee> filtered_data = li.stream().filter(s -> s.ID > 1200);
		filtered_data.forEach(  
                employee -> System.out.println(employee.name)) ;
		// TODO Auto-generated method stub

	}

}
