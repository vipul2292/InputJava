package Input;
import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number= ");
     int n=sc.nextInt();
     
    
     if(n==2) {
    	 System.out.println("It is prime number");
     }else {
    	 boolean isPrime=true;
    	 for(int i=2;i<=n-1;i++) {
    		 if(n % i== 0) {
    			 isPrime=false;
    		 }
    	 }
    	 if(isPrime==true) {
    		 System.out.println("It is prime number");
    	 }else {
    		 System.out.println("It is not prime number");
        }	 
     }	
   }
}
