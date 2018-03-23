import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SolutionLOcale {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        // Write your code here.
	        Locale indiaLocale = new Locale("en", "IN");
	        
	        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
	   	    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	   	    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	     	NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
	   	
	   	
	        System.out.println("US: " +usa.format(payment) );
	       System.out.println("India: " + india.format(payment));
	        System.out.println("China: " + china.format(payment));
	        System.out.println("France: " + france.format(payment));
	}

}
