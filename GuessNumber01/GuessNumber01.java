import java.util.Scanner;

public class GuessNumber01{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);
		System.out.println("There is a number which is between 1 and 100 in my mind.\nPlease try to guess it.");
		System.out.print("Please enter the number which you guess : ");
		int guess = s.nextInt();
		int count = 1;
		while(guess!=number)
		{
			System.out.println("You are wrong!Please try again.");
			if(guess>number)
			{
				System.out.println("It is too high.");
			}
			else
			{
				System.out.println("It is too low.");
			}
			System.out.print("Please enter the number which you guess : ");
			guess = s.nextInt();
			count++;
		}
		System.out.println("Congratulation!You guess right!And you guess " + count +" times.");
	}
}