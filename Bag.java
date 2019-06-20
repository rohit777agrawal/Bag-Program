
public class Bag {
	
	// private instance variable ->-> only accessible within this class
	private String name;
	private double currentWeight;
	private double maximumWeight;
	
	//default constructor ->-> special method
	public Bag()
	{
		name = "";
		currentWeight = 0.0;
		maximumWeight = 5.0;
	}
	
	// method to set ->-> name
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	// method to get ->-> name
	public String getName()
	{
		return name;
	}
	
	// method to add item ->-> by determining weight
	public void addItem(double newWeight)
	{
		if (newWeight > 0 && (currentWeight + newWeight) <= maximumWeight)
		{
			currentWeight = currentWeight + newWeight;
		}
	}
	
	// method to get ->-> current weight
	public double getCurrentWeight()
	{
		return currentWeight;
	}
	
	// method to set ->-> maximum weight
	public void setMaximumWeight(double newMaximumWeight)
	{
		if (newMaximumWeight > 0 && newMaximumWeight >= currentWeight)
		{
			maximumWeight = newMaximumWeight;
		}
	}
	
	// method to get ->-> maximum weight
	public double getMaximumWeight()
	{
		return maximumWeight;
	}

}
