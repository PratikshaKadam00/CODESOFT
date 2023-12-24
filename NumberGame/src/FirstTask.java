import java.util.Random;
import java.util.Scanner;

public class FirstTask {

	public static int generateNumber()
	{
		Random random=new Random();
		
		return random.nextInt(100);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Number-Game ..!:)");
		
		System.out.println("In this game you can gause any number between 1 to 100 ");
		System.out.println("If your number is matching with number on screen then you win ");
		System.out.println("Please Note that You have only FIVE attempts");
		
		System.out.println("Gause the number");
		int value=generateNumber();
		boolean flag=true;
		int countAttempts=0;
		
		while(flag)
		{
		if(countAttempts<5)
		{
		  int gause=sc.nextInt();
		  countAttempts++;
		
		if(gause==value)
		{
			System.out.println("Your gause is correct ...Winner !.." );
			flag=false;
		}else if(gause <value)
		{
			System.out.println("Number you have given is too low gause "
					+"correct number attempt remaining "+ (5-countAttempts));
		}else
		{
			System.out.println("Number you have given is too high "
		       +"correct number attempt remaining "+ (5-countAttempts));
		}
			
		}
		else
		{
			System.out.println(" Sorry Your attempts are completed.. The correct answer is "+value);
			flag=false;
		}
		}
	
	}

}
