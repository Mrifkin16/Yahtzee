import java.util.Scanner;

public class YahtzeeDriver {
	/*
	1. Creates a new instance of the YahtzeeGame class
	2. Calls the playGame method on the Yahtzee object
	3. Asks user if they would like to play again
	4. When the user is done playing, prints the number of games played, min, max, and average score
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;
		YahtzeeGame myGame = new YahtzeeGame();
		String name = "Madi";
		System.out.println("Welcome to " + name + "'s" + " APCSA Yahtzee Game!");
		score = myGame.playGame();
		System.out.println("Would you like to play again?(y/n) ");
		String answer = s.nextLine();
		int number = 1;
		int minScore =1000;
		int maxScore =-999;
		int score1 = 0;
		double avg = 0.0;
		do {
			if (answer.equals("y")) {
				score = myGame.playGame();
				System.out.println("Would you like to play again?(y/n) ");
				answer = s.nextLine();
				number ++ ;
			}
			if (score>minScore){
				score = minScore;
			}
			if(score<maxScore){
				score = maxScore;
			}
			avg += score;
		} while (answer.equals("y"));
		System.out.println("Number of times played: " + number);
		System.out.println("Max: " + maxScore);
		System.out.println("Min: " + minScore);
		System.out.println("Avg: " + (avg/number));


	}
}
