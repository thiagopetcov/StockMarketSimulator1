import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		 //Company array it will store 100 companies
		ArrayList<Company> companies = new ArrayList<>();
		//Investor array it will store 100 investors 
		ArrayList<Investor> investors = new ArrayList<>();
	   
		// Random class builded in java to randomly get the values 
        Random random = new Random();
		
        //Loop to create 100 companies 
		for (int i = 1; i < 101; i++) {
			int min = 500, max = 1000, minPrice = 10, maxPrice = 100, minBudget = 1000, maxBudget = 10000;
 			Company company = new Company();
			company.setId(i);
			company.setShares(min + random.nextInt(max));
			company.setPrice(minPrice + random.nextInt(maxPrice));
			company.setBudget(minBudget + random.nextInt(maxBudget));
			companies.add(company);
		}
		
		for (Company company : companies) {
			System.out.println("Company ID: " + company.getId() + " Shares: " + company.getShares() + " Price: " + company.getPrice() + "Budget" + company.getBuget());
		}
		//Loop to create 100 classes 
		for (int i = 1; i < 101; i++) {
			Investor investor = new Investor();
			investor.setId(i);
			investors.add(investor);
		}
		//Loop to print out investors ID
		for (Investor investor : investors) {
			System.out.println("Investor ID: " + investor.getId());
		}
		
		
		System.out.println("RANDOM: " + random.nextInt(100));
	}

}
