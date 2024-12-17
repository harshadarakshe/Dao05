package Day05;
import java.util.*;
public class FactorialNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the to know the factorial");
	int no=sc.nextInt();
	int i=1;
	int mult=1;
	while(i<=no) {
		
		mult=mult*i;
		++i;
		
	}
	System.out.println(mult);
}
}
