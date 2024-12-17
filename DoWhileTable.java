package Day05;
import java.util.*;
public class DoWhileTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to print the table");
	int no=sc.nextInt();
	int i=1;
	int mult=0;
	do {
		mult=i*no;
		System.out.println(i+"*"+ no+"="+mult);
		i++;
	}while(i<=10);
	
}
}
