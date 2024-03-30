import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private String name;
	private Integer passengerNumber;
	private List<Activity> bookedActivities;
	
	
	public Passenger(String name, Integer passaengerNumber) {
		this.name = name;
		this.passengerNumber = passengerNumber;
		this.bookedActivities = new ArrayList<>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public Integer getPassengerNumber() {
		return this.passengerNumber;
	}
	
	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	
	public List<Activity> getActicities() {
		return this.bookedActivities;
	}
	
	public void setActivity(Activity activity) {
		this.bookedActivities.add(activity);
	}
	
	public void addActivity(Activity activity) {
		if(activity.isAvailble()) {
			this.bookedActivities.add(activity);
			activity.setCapacity(activity.getCapacity()-1);
		}else {
			System.out.println("This activity fully booked");
		}
		
	}
	
	
}


/* Standard Passenger*/

class StandardPassenger extends Passenger{
	private double balance ;
	public StandardPassenger(String name, Integer passaengerNumber, double balance) {
		super(name, passaengerNumber);
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	public void addActivity(Activity activity) {
		double discountCost = activity.discountCost(this);
		if(balance>=discountCost) {
			this.setBalance(this.balance-discountCost);
			super.addActivity(activity);
		}else {
			System.out.println("Insufficient balance for this activity");
		}

	}
	
}

/* Gold Passenger */

class GoldPassenger extends Passenger{
	double balance;
	public GoldPassenger(String name, Integer passaengerNumber, double balance) {
		super(name, passaengerNumber);
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addActivity(Activity activity) {
		double discountCost = activity.discountCost(this);
		if(balance>=discountCost) {
			this.setBalance(this.balance-discountCost);
			super.addActivity(activity);
		}else {
			System.out.println("Insufficient balance for this activity");
		}

	}
}

/* Premium passenger  */

class PremiumPassenger extends Passenger{
	public PremiumPassenger(String name, Integer passaengerNumber) {
		super(name, passaengerNumber);
		
	}
	
	public void addActivity(Activity activity) {
		super.addActivity(activity);
	}
}