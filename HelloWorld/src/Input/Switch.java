package Input;
import java.util.*;


public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 
       int day;
       System.out.println("Enter the value of the day= ");
       day=sc.nextInt();
       
       switch(day) {
       
       case 1: System.out.println("It's Monday");
               break;
       
       case 2: System.out.println("It's Tuesday");
               break;
       
       case 3: System.out.println("It's Wednesday");
               break;
        
       case 4: System.out.println("It's Thursday");
               break;
       
       case 5: System.out.println("It's Friday");
               break;
       
       case 6: System.out.println("It's Saturday");
               break;
       
       case 7: System.out.println("It's Sunday");
               break;
               
       default: System.out.println("There is no such day present");
       }
		
	}

}
