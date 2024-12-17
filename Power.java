package Day05;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter base no");
	int base=sc.nextInt();
	System.out.println("Enter index number");
	int index=sc.nextInt();
	int mult=1;
	for(int i=0;i<index;i++) {
		mult=mult*base;
	}
	System.out.println(mult);
}
}
