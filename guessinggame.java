package akashsharma;

import java.util.Scanner;

public class guessinggame {
	public static void main(String []args) {
		int randomNumber = (int) (Math.random() * 100) + 1;
		boolean haswon = false;
		System.out.println("I have Randomaly choosen a Number between 1 to 100 ");
		System.out.println("Try Guessing it....!");
		Scanner a =  new Scanner(System.in);
		for(int i = 10; i > 0; i--) {
			System.out.println("You have " + i + " guess(es) left!!! Choose Again...");
			int guess = a.nextInt();
			if(randomNumber < guess) {
				System.out.println("It is Smaller than:"+ guess);
			}
			else if(randomNumber > guess) {
				System.out.println("It is Greater than:"+ guess);
			}
			else {
				haswon= true;
				break;
			}
		}
		if(haswon) {
			System.out.println("Correct you WON!!!!");
		}
		else {
			System.out.println("Game OVER uou LOOSE!!!");
			System.out.println("Correct Answer was:"+ randomNumber);
		}
		
	}

}
