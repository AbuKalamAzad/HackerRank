
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solutionsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    String str=scan.next();
	    int k=scan.nextInt();
	ArrayList a=new ArrayList();
	
	for(int i=0;i<=str.length()-k;i++)
	{
		a.add(str.substring(i, i+k));
	}
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	System.out.println(a.get(0));
	System.out.println(a.get(a.size()-1));
	}
	

}
