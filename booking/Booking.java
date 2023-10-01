import java.util.*;

import bus.Bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	Booking () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the Passenger ");
		passengerName = scan.next();
		System.out.println("Select the Bus Name");
		busNo = scan.nextInt();
		System.out.println("Enter the Date (MM-DD-YYYY)");
		String dateInput = scan.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public boolean isAvailable(ArrayList <Booking> bookings,ArrayList <Bus> buses) {
		 int capacity=0;
		 for(Bus bus:buses) {
			 if(bus.getBusNo() == busNo)
				 capacity = bus.getCapacity();
		 }
		 int booked = 0;
		 for(Booking b:bookings ) {
			 if(b.busNo == busNo && b.date.equals(date)) {
				 booked++;
			 }
		 }
		 return booked<capacity?true:false;
		}

	public static void main(String[] args) {
		  
	}

}