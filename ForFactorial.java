package Day05;
import java.util.*;
public class ForFactorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	int fact=1;
	int i=1;
	for(i=1;i<=no;++i) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
