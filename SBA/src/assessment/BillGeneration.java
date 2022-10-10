package assessment;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		int pizzas,puffs,cooldrink,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought:");
		pizzas=sc.nextInt();
		System.out.println("Enter the no of puffs bought:");
		puffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		cooldrink=sc.nextInt();
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("No of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+cooldrink);
		int p=(pizzas*100);
		int pf=(puffs*20);
		int cd=(cooldrink*10);
		total=p+pf+cd;
		System.out.println("Total price="+total);
		System.out.println("ENJOY THE SHOW!!!");
		sc.close();
		// TODO Auto-generated method stub

	}

}
