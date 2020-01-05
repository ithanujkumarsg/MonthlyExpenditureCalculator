import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ExpenditureCalculator {

	ArrayList<Newspaper> newspapers = new ArrayList<Newspaper>();
	
	public ExpenditureCalculator()
	{
		this.addNewspapers();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter news papers comma separated. Supported Newspapers list: {TOI,Hindu,ET,BM,HT}" );
		
		Scanner scanner = new Scanner(System.in);
		String newsPaperList = scanner.nextLine();
		scanner.close();
		String[] papers = newsPaperList.split(",");
		
		ExpenditureCalculator expenditureCalculator = new ExpenditureCalculator();
		expenditureCalculator.calculateExpenditure(papers);
	}

	private void calculateExpenditure(String[] papers) {
		
		float sum=0, totalsum=0;
		HashMap<String, Float> hashMap = new HashMap<String, Float>();
		for(int i=0;i<papers.length;i++)
		{
			for(int j=0;j<newspapers.size();j++)
			{
				if(newspapers.get(j).name.equals(papers[i]))
				{
					sum = newspapers.get(i).getMonthlySubscriptionPrice();
					hashMap.put(newspapers.get(i).name, sum);
				}
			}
		}
		
		System.out.println(hashMap);
		Iterator iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry = (Entry) iterator.next();
			totalsum = totalsum + (float) entry.getValue();
		}
		System.out.println("Total monthly sunscription amount is : " + totalsum + "Rs.");
		
	}
	
	private void addNewspapers() {
		
		Newspaper TOI = new Newspaper("TOI", 3, 5, 6);
		Newspaper Hindu = new Newspaper("Hindu", 2.5f, 4, 4);
		Newspaper ET = new Newspaper("ET", 2, 2, 10);
		Newspaper BM = new Newspaper("BM", 1.5f, 1.5f,1.5f);
		Newspaper HT = new Newspaper("HT", 2, 4, 4);
		
		newspapers.add(Hindu);
		newspapers.add(TOI);
		newspapers.add(ET);
		newspapers.add(BM);
		newspapers.add(HT);
	}
}
