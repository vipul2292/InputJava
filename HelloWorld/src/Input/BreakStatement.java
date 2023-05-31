package Input;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //exit the loop when i==3 ,i.e., print upto 2
		
		for(int i=1;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am exiting the loop when i==3");
	}

}
