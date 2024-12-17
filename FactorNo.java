package Day05;
import java.util.*;
public class FactorNo {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter a number");
	int no=sc.nextInt();
	int fact=0;
	int i;
	for(i=1;i<=no;i++) {
	if(no%i==0) {
		System.out.println("factors of number ="+i);
	}
	}
	
}
}
