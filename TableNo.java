package Day05;
import java.util.*;
public class TableNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int no=sc.nextInt();
	 int i=1;
	 int table=0;
	 for(i=1;i<=10;i++) {
		 table=i*no;
		 System.out.println(i+"*"+no+" "+"="+table);
	 }
}
}
