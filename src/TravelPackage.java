import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
	private String name;
	private Integer capacity;
	private List<Destination> itinerary ;
	private List<Passenger> listOfPassenger;
	
	
	public TravelPackage (String name, Integer capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.itinerary = new ArrayList();
		this.listOfPassenger = new ArrayList();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public List<Destination> getDestinations() {
		return this.itinerary;
	}
	
	public void setDestinations(List<Destination> itinerary) {
		this.itinerary.addAll(itinerary);
	}
	
	public void addDestination (Destination destination) {
		this.itinerary.add(destination);
	}
	
	
/*	1. Print itinerary of the travel package including: 
    1. travel package name, 
    2. destinations and details of the activities available at each destination, like name, cost, capacity and description.
    */
	
	
	public void Itinerary() {
		System.out.println("Name of the travel package is : " + name);
		
//		To print the list of destinations and Activities availble
		
		if(this.itinerary.size()<1) {
			System.out.println("No Destinations are not added in this package");
		}else {
			for(Destination destination: itinerary) {
				System.out.println("Destination is: "+ destination.getName());
				int counter = 1;
				for(Activity activity:destination.getActivities()) {
					System.out.println(counter++ + ". Activity name is " + activity.getName() + "," + " cost : "
							+ activity.getCost() + "," + " capacity : " + activity.getCapacity() + "," + " description : "
							+ activity.getDescription());

				}
			}
		}
		
	}
	
/*	2. Print the passenger list of the travel package including: 
	    1. package name, 
	    2. passenger capacity, 
	    3. number of passengers currently enrolled and 
	    4. name and number of each passenger
*/
	
	public void PassangersList () {
		System.out.println("Name of the travel package is : " + name);
		System.out.println("This package has the capacity of "+ capacity+ "there are "+ listOfPassenger.size() +" enrolled for this package");
		
		// To print the passengers details
		int counter = 1;
		for(Passenger passenger: listOfPassenger) {
			System.out.println(counter++ + "Name of passenger "+ passenger.getName()+ "Number of Passenger is "+ passenger.getPassengerNumber());
		}
		
	}
	
	/*
	 * 
	 * 3. Print the details of an individual passenger including their 
    1. name, 
    2. passenger number, 
    3. balance (if applicable), 
    4. list of each activity they have signed up for, including the destination the at which the activity is taking place and the price the passenger paid for the activity.
	 */
	
	public void PassengersDetails() {
		
		for(Passenger passenger: listOfPassenger) {
			System.out.println("The name of the passenger is: "+ passenger.getName());
			if(passenger  instanceof StandardPassenger) {
				StandardPassenger standardPassemger = (StandardPassenger) passenger;
				System.out.println("The wallet balance associated with customer wallet is : "+standardPassemger.getBalance());
			}
			
			if(passenger instanceof GoldPassenger) {
				GoldPassenger goldPassenger = (GoldPassenger) passenger;
				System.out.println("The wallet balance associated with customer wallet is : "+goldPassenger.getBalance());
					
			}
			
			if(passenger.getActicities().size()>0) {
				int counter=1;
				System.out.println(" The passenger has the booked activities");
				for(Activity activity: passenger.getActicities()) {
					System.out.println(counter++ + "Destination is:" + activity.getDestination().getName()+"Name of the activity is "+ activity.getName()+"Price is :"+ activity.discountCost(passenger));
				}
				
			}	
		}
	}
	
	
	
	

}
