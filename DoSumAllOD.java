package Day05;
import java.util.*;
public class DoSumAllOD {
public static void main(String[] args) {
	int sum=0;
	int no=1;
	do {
		System.out.println(sum);
		sum=+no;
		no+=2;
	}while(no<=10);
}
}
