package user_ticket_project;

public class Passenger {
	private String name;
	private int age;
	private long mobile;
	private long aadhar;

	public Passenger(String name, int age, long mobile, long aadhar) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public void detailsPassenger() {
		System.out.println("\nPassenger name		: " + getName());
		System.out.println("Passenger age		: " + getAge());
		System.out.println("Passenger mobile number	: " + getMobile());
		System.out.println("Passenger aadhar number	: " + getAadhar());
	}

	public void detailsTicket(Ticket t) {
		t = new Ticket(t.getTicketId(), t.getTicketCost(), t.getBoardingPoint(), t.getDestinationPoint());
		System.out.println("Ticket Id		: " + t.getTicketCost());
		System.out.println("Ticket cost		: " + t.getTicketCost());
		System.out.println("Ticket boarding point	: " + t.getBoardingPoint());
		System.out.println("Ticket destination point	: " + t.getDestinationPoint());
	}

	@Override
	public String toString() {
		return "\nPassenger name		: " + name + "\nPassenger age		: " + age + "\nPassenger mobile number	: "
				+ mobile + "\nPassenger aadhar number	: " + aadhar;
	}

}
