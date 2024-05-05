import java.util.Scanner;

public class CalculateGroceryBill {

	public static void main(String[] args) {
		
		// Initiate scanner to scan input data
		
		Scanner scnr = new Scanner(System.in);
		
		// Initiate variables needed for calculations and storing user input, if they are entered
		// as int type i believe they will be converted to double which is perfect.
		
		double couponPercentage;
		double weekOneBill;
		double weekTwoBill;
		double weekThreeBill;
		double weekFourBill;
		double monthTotal;
		double weekAverage;
		
		// Prompt user to input coupon percentage
		
		System.out.print("Enter coupon percentage as decimal: ");
		
		// Set couponPercentage to the previous input by user
		
		couponPercentage = scnr.nextDouble();
		
		// if the coupon is > 1 or <= 0 set to 0.1 
		
		if (couponPercentage > 1 || couponPercentage <= 0) {
			couponPercentage = 0.1;
		}
		
		//Prompt our user for their weekly grocery bills for one month and set variables
		
		System.out.print("Week One Bill: ");
		weekOneBill = scnr.nextDouble();
		System.out.print("Week Two Bill: ");
		weekTwoBill = scnr.nextDouble();
		System.out.print("Week Three Bill: ");
		weekThreeBill = scnr.nextDouble();
		System.out.print("Week Four Bill: ");
		weekFourBill = scnr.nextDouble();
		
		//Calculate monthly total and week average
		
		monthTotal = weekOneBill + weekTwoBill + weekThreeBill + weekFourBill;
		
		weekAverage = monthTotal / 4.0;
		
		//output totals and average with and without coupon
		
		System.out.printf("Monthly total: $%.2f  Weekly average: $%.2f\n", monthTotal, weekAverage);
        System.out.printf("Monthly total with coupon: $%.2f  Weekly average with coupon: $%.2f\n", 
                          monthTotal * (1 - couponPercentage), weekAverage * (1 - couponPercentage));
        
        //Close scanner because i saw error in the problems section 
        
        scnr.close();

	}

}
