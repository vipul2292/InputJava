package Input;
import java.util.*;

public class ReverseOfANumberWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the number(n)= ");
		n=sc.nextInt();
		
		while(n>0) {
			int lastDigit=n%10;
			System.out.print(lastDigit+" ");
			n/=10;
		}
	}  
}
