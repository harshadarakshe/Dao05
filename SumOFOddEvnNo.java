package Day05;
import java.util.*;
public class SumOFOddEvnNo {
public static void main(String[] args) {
	int n=1;
	int sum=0;
	while(n<=10) {
		sum=n+sum;
		
		n++;
	}
	System.out.println("The sum of all even no ="+ sum);
}
}
