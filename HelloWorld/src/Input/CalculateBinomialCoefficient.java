package Input;
import java.util.*;

public class CalculateBinomialCoefficient {

	public static int factorial(int num) {
		
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static double calculateBinomial(int n,int r) {
		
		int fact_n=factorial(n);
		int fact_r=factorial(r);
		int fact_nmr=factorial((n-r));
		double bc=(fact_n)/(fact_r)*(fact_nmr);
		
		return bc;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the value of the n= ");
         int N=sc.nextInt();
         
         System.out.println("Enter the value of the r= ");
         int R=sc.nextInt();
         
         double result=calculateBinomial(N, R);
         System.out.println("The Binomial Coefficient is = "+result);
	}
}
