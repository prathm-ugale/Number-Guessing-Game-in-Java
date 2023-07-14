import java.util.Random;
import java.util.Scanner;

class Guess { 
  public Guess(int x,int y,int i) {

	if(y==x)
		{
	    System.out.println("Congratulations you won this game in"+" "+i+" "+"chance");
		
			System.exit(i);
		}
	else if(y>x)
	{
		System.out.println("The computer number is greater");
	}
	else 
	{
		System.out.println("The computer number is smaller");
	}

	
}
}

class Main {

public static void main(String[] args) {
	
	System.out.println("!!....WELCOME TO GUESSING NUMBER GAME....!!");
	Random r=new Random();
	int r1=r.nextInt(100);
	
	
	Guess su[]=new Guess[30];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("LETS CHECK YOUR CONFIDENCE NOW!!");
	System.out.println("IN HOW MANY NUMBER OF GUESSES YOU WILL FIND IT OUT??");
	int n=sc.nextInt();

	
	for(int i=1;i<=n;i++)
	{	
			int a=n-i;
			System.out.println();
			System.out.println("Enter the number For "+i+ " "+"guess and your"+" "+a+" "+" guess remaining");
			int num=sc.nextInt();
			su[i]= new Guess(num,r1,i);
		
		
	}
	System.out.println("Opps!! you lost this game");
	System.out.println("The Computer Number is:"+r1);
	System.out.println("Your score is :"+ n*10);
	
	
}
}
