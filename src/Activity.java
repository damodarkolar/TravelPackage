import java.util.HashSet;
import java.util.Set;

public class Activity {
	private String name;
	private String description;
	private Destination destination;
	private double cost; 
	private Integer capacity;
	
	
	static Set<Activity> allActivities = new HashSet<>();
	
	public Set<Activity> getAllActivities() {
		return this.allActivities;
	}
	
	public void addNewActivity(Activity activity) {
		this.allActivities.add(activity);
	}
	
	
	public Destination getDestination() {
		return this.destination;
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public Boolean isAvailble() {
		return this.capacity>0;
	}
		
	public String getName () {
		return this.name; 
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getDescription () {
		return this.description;
	}
	
	public void setDescription() {
		this.description =description;
	}
	
	public Integer getCapacity () {
		return this.capacity;
	}
	
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	public double discountCost(Passenger passenger) {
		if(passenger instanceof PremiumPassenger) {
			return this.cost*0.9;
		}
		if(passenger instanceof PremiumPassenger) {
			return 0;
		}
		return this.cost;
	}
	
	
	
}
