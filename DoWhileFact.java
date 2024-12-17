package Day05;
import java.util.*;
public class DoWhileFact {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	int i=1;
	int fact=1;
	do {
		fact=fact*i;
		++i;
		
	}while(i<=no);
	System.out.println(fact);
	
	
}
}
