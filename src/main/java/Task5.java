
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Task5
{
	public static final Logger LOGGER=LogManager.getLogger(Task5.class);
	 public static void main( String[] args )
	    {
	        Scanner sc=new Scanner(System.in);
	        InterestCal interestCalculator =new InterestCal();
	        CostEst houseConstructionCost;
	        LOGGER.info("Select an option :  \\n 1.Simple Interest 2.Compound Interest\\n");
	        if(sc.nextInt()==1) {
	        	LOGGER.info("Enter principal, rate of interest and time in years :\n");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	LOGGER.info("The amount is:: "+interestCalculator.simpleInterest(principal, rate, timeInYears));
	        }
	        else {
	        	LOGGER.info("Enter principal, rate of interest and time in years and number of times interest is compounded in an year :\n");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	int noOfTimesInterestCompoundedInYear=sc.nextInt();
	        	LOGGER.info("Amount is: "+interestCalculator.compoundInterest(principal, rate, timeInYears,noOfTimesInterestCompoundedInYear));
	        }
	        LOGGER.info("\nHouse Construction -->\nEnter material standard as: (1.standard 2.above standard 3.high standard)");
	        int standard=sc.nextInt();
	        LOGGER.info("\n Also enter the total area of the house: ");
	        double area=sc.nextDouble();
	        if(standard==3){
	        	LOGGER.info("Do you want the house to be fully automated? Enter--\n 1.Yes 2.No\n");
	        	int option=sc.nextInt();
	        	houseConstructionCost=new CostEst(standard,area,option==1?true:false);
	        	LOGGER.info("Total cost required: "+houseConstructionCost.cost());
	        }
	        else {
	        	houseConstructionCost=new CostEst(standard,area);
	        	LOGGER.info("Total cost required: "+houseConstructionCost.cost());
	        }
	        sc.close();
	    }
}
