import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		
		while(testcase>0)
		{
			try {
			String pattern=sc.next();
			Pattern.compile(pattern);
			System.out.println("valid");
			}
			catch (PatternSyntaxException  e) {
				// TODO: handle exception
				System.out.println("invalid");
			}
			//testcase--;
		}

	}

}
