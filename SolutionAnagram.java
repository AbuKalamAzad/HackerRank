import java.util.Arrays;
import java.util.Scanner;

public class SolutionAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		
		String s1=a.replaceAll("\\s", "");
		String s2=b.replaceAll("\\s", "");
		
		if(s1.length()!=s2.length())
		return false;
		else
		{
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
	return Arrays.equals(c1, c2);	
			}
		
	}

}
