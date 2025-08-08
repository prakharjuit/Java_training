package wiprodemo;
class TicketBooking
{
	int availableSeats=1;
	public synchronized void bookTicket(String name)
	{
		if(availableSeats>0)
		{
			System.out.println(name+"is booking ticket");
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				System.out.println("");
			}
			System.out.println(name +" successfullly booked ticket");
			availableSeats--;
		}
		else
		{
			System.out.println("sorry "+name+" no seats available");
		}
	}
}
class User extends Thread
{
	TicketBooking book;
	String username;
	public User(TicketBooking booking,String userName)
	{
		this.book=booking;
		this.username=userName;
	}
	public void run()
	{
		book.bookTicket(username);
	}
}
public class Threadd {
	public static void main(String[] args)
	{
		TicketBooking booking=new TicketBooking();
		User user1= new User(booking,"User1");
		User user2= new User(booking,"User2");
		User user3= new User(booking,"User3");
		user1.start();
		user2.start();
		user3.start();
		
		
	}

}
