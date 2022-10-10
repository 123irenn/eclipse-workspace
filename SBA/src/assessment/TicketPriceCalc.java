package assessment;

import java.util.Scanner;

class Ticket{
	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		{
		Ticket.availableTickets = availableTickets;
		}
	}
	public int calculateTicketCost(int nooftickets)
	{
		int tik=getAvailableTickets();
		if(nooftickets>tik)
		{
			return -1;
			
			
		}
		else {
			 tik-=nooftickets;
			 setAvailableTickets(tik);
			 return price*nooftickets;
		}
	
	}
}

public class TicketPriceCalc {

	public static void main(String[] args) {
		Ticket t=new Ticket();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		n=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int AvlTick=sc.nextInt();
		t.setAvailableTickets(AvlTick);
		do {
			System.out.println("Enter the ticketid:");
			int tID=sc.nextInt();
			t.setTicketid(tID);
			System.out.println("Enter the price:");
			int p=sc.nextInt();
			t.setPrice(p);
			System.out.println("Enter the no of tickets:");
			int not=sc.nextInt();
			
			System.out.println("Available tickets:"+t.getAvailableTickets());
			System.out.println("Total amount:"+t.calculateTicketCost(not));
			System.out.println("Available ticket after booking:"+t.getAvailableTickets());
			
			n--;
			
		}while(n>0);
		
		// TODO Auto-generated method stub

	}

}
