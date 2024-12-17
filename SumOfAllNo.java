package Day05;

public class SumOfAllNo {
	public static void main(String[] args) {
		int no=1;
		int sum=0;
		int add=0;
		for(no=1;no<=30;no++) {
			if(no%2==0) {
				sum=sum+no;
				
			}
			else {
				add=add+no;
			}
		}
		System.out.println("Sum of all Even no="+sum);
		System.out.println("Sum of all odd number ="+add);
	}

}
