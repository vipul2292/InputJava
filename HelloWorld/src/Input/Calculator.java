package Input;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculator using switch statement
		
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		char operator;
		System.out.println("Enter the value of the a= ");
		a=sc.nextInt();
		System.out.println("Enter the value of the b= ");
		b=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the operation which you want to perform? ==  ");
		operator=sc.next().charAt(0);
		
		switch(operator) {
		
		case '+' :System.out.println("The sum of a and b is = "+(a+b));
		          break;
		  
		case '-' :System.out.println("The Subtraction of a and b is = "+(a-b));
                  break;
        
		case '*' :System.out.println("The Multiplication of a and b is = "+(a*b));
                  break;
        
		case '/' :System.out.println("The Quotient when a is divided by b is = "+(a/b));
                  break;
        
		case '%' : System.out.println("The remainder when a is divided by b is = "+(a%b));
		           break;
		
        default : System.out.println("Invalid Input Entered By the USER");
      
		}
	}
}
