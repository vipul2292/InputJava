package Input;
import java.util.*;

//Display all numbers entered by the user except multiples of 10

public class ContinueE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the number= ");
			n=sc.nextInt();
			if(n % 10==0) {
				System.out.println("Sorry, Entered no is multiple of 10. So, WE CAN'T DISPLAY");
				continue;
			}
			System.out.println("Entered no is not multiple of 10 that is = "+n);
		}while(true);
	}
}
