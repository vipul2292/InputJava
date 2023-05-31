package Input;

import java.util.*;

public class ReverseGivenNumberWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,rev=0;
		System.out.println("Enter the value of number= ");
		num=sc.nextInt();
		
		while(num>0) {
			int lastDigit=num%10;
			rev=(rev*10)+lastDigit;
			num/=10;
		}
		System.out.println("The reverse of the number is= "+rev);
	}
}
