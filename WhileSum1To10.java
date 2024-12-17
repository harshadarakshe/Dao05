package Day05;

public class WhileSum1To10 {
public static void main(String[] args) {
	int n=1;
	int sum=0;
	while(n<=10) {
		
		sum=sum+n;
		n++;
	}
	System.out.println("The sum of 1 to 10 numbers="+sum);
}
}
