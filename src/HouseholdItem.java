public abstract class HouseholdItem {

	String name;
	float price;
	Frequency frequeny;
	
	
	public HouseholdItem(String name, float price)
	{
		this.name = name;
		this.price = price;
	}
	
	public abstract float getMonthlySubscriptionPrice();
	
}

enum Frequency
{
	daily,weekly,biweekly
}
