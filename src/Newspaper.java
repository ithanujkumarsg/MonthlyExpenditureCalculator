public class Newspaper extends HouseholdItem{

	float saturdayPrice;
	float sundayPrice;
	
	public Newspaper(String name, float price, float saturdayPrice, float sundayPrice)
	{
		super(name, price);
		this.frequeny = Frequency.daily;
		this.saturdayPrice = saturdayPrice;
		this.sundayPrice = sundayPrice;
	}
	
	public float getMonthlySubscriptionPrice()
	{
		// currently the number of days is hardcoded.
		int noOfWeekDays = 23;
		int noOfSaturdays = 4;
		int noOfSundays = 4;
		
		float weekDaysPrice = price*noOfWeekDays;
		float saturdaysPrice = this.saturdayPrice*noOfSaturdays;
		float sundaysPrice = this.sundayPrice*noOfSundays;
		float monthlySunscriptionAmount = weekDaysPrice+saturdaysPrice+sundaysPrice;
		
		return monthlySunscriptionAmount;
	}
}
