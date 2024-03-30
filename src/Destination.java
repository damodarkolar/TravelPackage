import java.util.List;

public class Destination {
	
	private String name;
	private List<Activity> listOfActivities;
	
	
	
	public Destination(String name, List<Activity> activities) {
		this.name = name;
		this.listOfActivities = activities;
		
		for(Activity activity: activities) {
			activity.setDestination(this);
			activity.addNewActivity(activity);
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Activity> getActivities(){
		return this.listOfActivities;
	}
	
	public void setActivity(List<Activity> activities) {
		this.listOfActivities = listOfActivities;
	}
	
	public void addSingleActivity(Activity activity) {
		activity.setDestination(this);
		this.listOfActivities.add(activity);
		activity.addNewActivity(activity);
	}
	

}
