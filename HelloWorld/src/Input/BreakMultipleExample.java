package Input;
import java.util.*;


public class BreakMultipleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the number= ");
			
			n=sc.nextInt();
			if(n%10==0) {
				break;
			}
			System.out.println(n);
		}while(true);
	}
}
