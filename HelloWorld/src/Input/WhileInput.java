package Input;
import java.util.*;


public class WhileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 1 to n when n is given by the user
		
       Scanner sc=new Scanner(System.in);
        
       int n,count=1;
       System.out.println("Enter the value of range(n)= ");
       n=sc.nextInt();
       
       while(count<=n) {
    	   System.out.println(count);
    	   count++;
       }	
	}
}
