package Input;
import java.util.*;

public class DoWhileLoop {

	//print first 5 natural number
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=1;
		int n;
		System.out.println("Enter the value of the n= ");
		n=sc.nextInt();
		
		do {
			System.out.println(count);
			count++;
		}while(count<=n);
	}

}
