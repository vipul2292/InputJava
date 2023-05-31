package Input;
import java.util.*;
public class Function {
	
	public static int CalculateSum(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num1= ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the value of num2= ");
		int num2=sc.nextInt();
		
		int result=CalculateSum(num1, num2);
		System.out.println("The sum of two given number is= "+result);
		
	}

}
