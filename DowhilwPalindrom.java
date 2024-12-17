package Day05;
import java.util.*;
public class DowhilwPalindrom {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int i=no;
		int rev=0;
		do{
			int show=no%10;
			 rev=(rev*10)+show;
			no=no/10;
			
			
		}while(no>0);
		if(i==rev) {
			System.out.println("palindrom no");
		}
		
		else {
			System.out.println("not palindrom");
		};
	}

}
