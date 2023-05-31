package Input;
import java.util.*;

public class SumofNNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	  int n,count=1,sum=0;
	  System.out.println("Enter the value of the n= ");
	  n=sc.nextInt();
	  
	  while(count<=n) {
		  sum+=count;
		  count++;
	  }
		System.out.println("Sum of first "+n + " natural numbers is = " +sum);
	}

}
