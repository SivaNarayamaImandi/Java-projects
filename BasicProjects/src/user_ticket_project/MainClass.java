package user_ticket_project;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		Booking b = new Booking();
		boolean start = true;
		b.design();
		while (start) {
			System.out.println(
					"\nChoose Options\n 1.Book ticket\n 2.Display ticket details\n 3.Display passenger details\n 4.Search ticket based on Id\n 5.Update passenger name based on aadhar\n 6.Cancle ticket based on ticket Id\n 7.Display passenger details based on destination\n 8.Exit");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your age");
				int age = sc.nextInt();
				long mobile = r.nextLong(9000000000l);
				long aadhar = r.nextLong(900000000000l);
				int id = r.nextInt(9000);
				System.out.println("Enter ticket cost(Cost shoubld be 100-800)");
				int cost = sc.nextInt();
				if (cost >= 100 && cost <= 800) {
					System.out.println("Enter Boarding point (Kachiguda,Lingampalli,Secunderabad)");
					String boarding = sc.next();
					if (boarding.equalsIgnoreCase("Kachiguda") || boarding.equalsIgnoreCase("Secunderabad")
							|| boarding.equalsIgnoreCase("Lingampalli")) {
						System.out.println("Enter destination point (Bengaluru,Pune,Chennai)");
						String destination = sc.next();
						if (destination.equalsIgnoreCase("Bengaluru") || destination.equalsIgnoreCase("Chennai")
								|| destination.equalsIgnoreCase("Pune")) {
							b.bookTicket(new Passenger(name, age, mobile, aadhar),
									new Ticket(id, cost, boarding, destination));
						} else {
							System.out.println("\nInvalid dstination point Try againg");
						}
					} else {
						System.out.println("\nInvalid boarding point Try againg");
					}
				} else {
					System.out.println("\nInvalid amount Try againg");
				}
			}
				break;
			case 2: {
				b.showTicket();
			}
				break;
			case 3: {
				b.showPassenger();
			}
				break;
			case 4: {
				System.out.println("Enter ticket id");
				b.searchTicketId(sc.nextInt());
			}
				break;
			case 5: {
				System.out.println("Enter aadhar");
				b.upadatePassengerName(sc.nextLong());
			}
				break;
			case 6: {
				System.out.println("Enter ticket id");
				b.cancleTicketId(sc.nextInt());
			}
				break;
//				case 7:{
//					System.out.println("Enter destination point");
//					b.passengerDestination(sc.next());
//				}
//				break;
			case 8: {
				start = false;
				System.out.println("\nTHANK YOU............");
			}
				break;
			default: {
				System.out.println("\nChoose valid option");
			}
			}
		}
		sc.close();
	}
}
