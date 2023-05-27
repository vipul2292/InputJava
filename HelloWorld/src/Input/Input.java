package Input;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here we will learn about how to take input in java
		
		int empid;
		int age;
		String Gender;
		String name;
		String address;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the empid of the employee : ");
		empid=sc.nextInt();
		System.out.println("Entered employeeId is: "+empid);
		
		
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Your entered age is : "+age);
		sc.nextLine();
		
		System.out.println("Enter Your gender: ");
		Gender=sc.nextLine();
		System.out.println("Your entered gender is : "+Gender);
		
		System.out.println("Enter the name of the employee: ");
		name=sc.nextLine();
		System.out.println("Your entered name is "+name);
		System.out.println();
		
		System.out.println("Enter the address of the employee: ");
		address=sc.nextLine();
		System.out.println("Your entered address is : "+address);
		System.out.println();
		
		System.out.println("!!! THANK YOU  !!!");

	}

}
