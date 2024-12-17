package Day05;
import java.util.*;
public class DoWhileOddNo521 {
public static void main(String[] args) {
	int i=521;
	int j=229;
	int sum=0;
	do {
		if(j%2!=0) {
		sum=sum+j;
		}
		j++;
	}while(i>=j);
	System.out.println("the sum of odd numbers "+sum);
}
}
