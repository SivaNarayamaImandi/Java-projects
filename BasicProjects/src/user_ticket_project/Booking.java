package user_ticket_project;

import java.util.ArrayList;
import java.util.Iterator;

public class Booking {
	public Ticket t;
	public Passenger p;
	ArrayList<Ticket> ticket = new ArrayList<Ticket>();
	ArrayList<Passenger> passenger = new ArrayList<Passenger>();

	// Add Ticket
	public void bookTicket(Passenger p, Ticket t) {
		passenger.add(p);
		ticket.add(t);
		System.out.println("\nTicket added successfully.........");
	}

	// Display Ticket details
	public void showTicket() {
		if (ticket.isEmpty())
			System.out.println("\nNo tickets available");
		else
			ticket.forEach((ticket) -> System.out.println((ticket)));
	}

	// Display Passenger detailse
	public void showPassenger() {
		if (passenger.isEmpty())
			System.out.println("\nNo passengers are available");
		else
			passenger.forEach((passenger) -> System.out.println((passenger)));
	}

	// Search ticket Id
	public void searchTicketId(int id) {
		boolean isFound = false;
		if (ticket.isEmpty())
			System.out.println("\nNo tickets available");
		else
			for (Ticket t : ticket) {
				if (t.getTicketId() == id) {
					t.display();
					isFound = true;
				}
			}
		if (isFound == false)
			System.out.println("\nInvalid Ticket Id");
	}

	// Update Passenger Name Based on aadhar number
	public void upadatePassengerName(long aadhar) {
		boolean isFound = false;
		if (passenger.isEmpty())
			System.out.println("\nNo passengers are available");
		else
			for (Passenger passenger2 : passenger) {
				if (passenger2.getAadhar() == aadhar) {
					passenger2.setName("SIVA");
					System.out.println("\nUpdate name successfull.........");
					isFound = true;
				}
			}
		if (isFound == false)
			System.out.println("\nInvalid aadhar number");
	}

	// Cancle/Remove Ticket Based on Ticket Id
	public void cancleTicketId(int id) {
		boolean isFound = false;
		Iterator<Ticket> i = ticket.iterator();
		while (i.hasNext()) {
			Ticket next = i.next();
			if (next.getTicketId() == id) {
				i.remove();
				System.out.println("\nTicket cancled successfull..........");
				isFound = true;
			}
		}
		if (isFound == false)
			System.out.println("\nInvalid ticket Id");
	}

	// Display Passenger Details Based on Destination Point
	public void passengerDestination(String destination) {
		boolean isFound = false;
		if (passenger.isEmpty())
			System.out.println("\nNo passengers are available");
		else
			for (Passenger passenger2 : passenger) {
				if (t.getDestinationPoint().equalsIgnoreCase(destination)) {
					passenger2.detailsPassenger();
					isFound = true;
				}
			}
		if (isFound == false)
			System.out.println("\nInavlid Destination point");
	}

	// Design
	public void design() {
		String s = "****** WELCOME TO THE TRAVELLING ******\n";
		for (int i = 0; i < s.length(); i++) {
			try {
				Thread.sleep(100);
				System.out.print(s.charAt(i));
			} catch (InterruptedException e) {
				System.out.println("Handled");
			}
		}
	}
}
