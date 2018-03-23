import java.util.Calendar;
import java.util.Scanner;

public class SolutionForDayofDate {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your date format(mm/dd/yyyy)");
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }

	private static String getDay(String day, String month, String year) {
		Calendar c =Calendar.getInstance();
		c.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek "+dayOfWeek);
		String Day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"}; 
		 return (Day[dayOfWeek-1]).toString();

	}
}


