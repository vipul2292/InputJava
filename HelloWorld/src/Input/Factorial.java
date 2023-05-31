package Input;
import java.util.*;

public class Factorial {
	
	
	public static int calculateFactorial(int num) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the num= ");
		int num1=sc.nextInt();
		int result=calculateFactorial(num1);
		System.out.println("The factorial of "+num1+" is = "+result);
		
	}

}
