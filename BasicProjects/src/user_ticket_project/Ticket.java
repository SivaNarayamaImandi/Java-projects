package user_ticket_project;

public class Ticket {
	private int ticketId;
	private int ticketCost;
	private String boardingPoint;
	private String destinationPoint;

	public Ticket(int ticketId, int ticketCost, String boardingPoint, String destinationPoint) {
		this.ticketId = ticketId;
		this.ticketCost = ticketCost;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public void display() {
		System.out.println("\nTicket Id		: " + getTicketId());
		System.out.println("Ticket cost		: " + getTicketCost());
		System.out.println("Ticket boarding point	: " + getBoardingPoint());
		System.out.println("Ticket destination point: " + getDestinationPoint());
	}

	@Override
	public String toString() {
		return "\nTicket Id			: " + ticketId + "\nTicket cost			: " + ticketCost
				+ "\nTicket boarding point		: " + boardingPoint + "\nTicket destination point	: "
				+ destinationPoint;
	}

}
