import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		int pin=1234;
		int balance=10000;
		int AddAmount=0;
		int TakeAmount=0;
		String name;
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter your pin number");
		int password= sr.nextInt();
		if(password==pin)
		{
			System.out.println("Enter your name");
			name=sr.next();
			System.out.println("Welcome "+ name);
			
			while(true)
			{
				System.out.println("Press 1 to check your balance");
				System.out.println("press 2 to add amount");
				System.out.println("press 3 to take amount");
				System.out.println("press 4 to take recipt");
				System.out.println("press 5 to EXIT");
				
				int opt=sr.nextInt();
				switch(opt)
				{
				case 1:
					System.out.println("your current balance is " + balance);
					break;
				case 2:
					System.out.println("How much amount did you like to Add to your account");
					AddAmount=sr.nextInt();
					System.out.println("Successfully credited");
					balance =AddAmount +  balance;
					break;
				case 3:
					System.out.println("How much amount did you want to take");
					TakeAmount=sr.nextInt();
					if(TakeAmount > balance)
					{
						System.out.println("Your Balance is insufficient!!");
						System.out.println("Try less than your available balance");
					}
					else
					{
						System.out.println("Successfully taken");
						balance =balance - TakeAmount;
					}
					break;
				case 4:
					System.out.println("Welcome to All in one mini ATM");
					System.out.println("Available balance "+ balance);
					System.out.println("Amount deposited "+ AddAmount);
					System.out.println("Amount taken "+ TakeAmount);
					System.out.println("Thanks for coming !!!");
					break;
				}
				if(opt==5)
				{
					System.out.println("Thank you");
					break;
				}
				
			} 
		}
		else
		{
			System.out.println("Wrong Pin number");
		}
	}

}
