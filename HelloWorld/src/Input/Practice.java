package Input;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		float temperature;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature in celsius: ");
		temperature=sc.nextFloat();
		
		float temp;
		temp=(((temperature-32)*5)/9);
		
		System.out.println("Temperature in Fahrenheit: "+ temp +" F");
		
		
	}

}
