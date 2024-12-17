package Day05;

import java.util.Scanner;

public class SumOFDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int sum=0;
		int i=0;
		for(i=1; i<=no;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of all digit="+sum);
	}
}
