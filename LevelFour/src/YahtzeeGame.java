/**
 * Created by kirstenmrifkin on 12/15/15.
 */
import java.util.Scanner;

public class YahtzeeGame {
    private YahtzeeDie dice1;
    private YahtzeeDie dice2;
    private YahtzeeDie dice3;
    private YahtzeeDie dice4;
    private YahtzeeDie dice5;
    private static final int NUM_SIDES=6;
    private YahtzeeScorecard scoreboard;




        /* initializes the dice and scoreboard */
        public YahtzeeGame()
        {}

        public int playGame()
        {
            for(int i = 0; i < 13; i++) {
                this.takeTurn();
            }
            scoreboard.printScoreCard();
            return scoreboard.getGrandTotal();
        }
        private void takeTurn()
        {
            Scanner s = new Scanner(System.in);
            rollDice();
            printDice();
            System.out.print("Are you (s)atisfied or would you like to (r)oll again (s/r):");
            String answer = s.nextLine();
            if(answer.equals("s")){
                markScore();
            } if (answer.equals("r")){
            chooseFrozen();
            rollDice();
            printDice();
            System.out.print("Are you (s)atisfied or would you like to (r)oll again (s/r):");
            String answer2 = s.nextLine();
            if(answer2.equals("s")){
                markScore();
            } if (answer2.equals("r")){
                chooseFrozen();
                rollDice();
                printDice();
                markScore();
            }
        }
        }
        private void rollDice()
        {
            if(!dice1.isFrozen()){
                dice1.rollDie();
            }
            if(!dice2.isFrozen()){
                dice2.rollDie();
            }
            if(!dice3.isFrozen()){
                dice3.rollDie();
            }
            if(!dice4.isFrozen()){
                dice4.rollDie();
            }
            if(!dice5.isFrozen()){
                dice5.rollDie();
            }
            dice1.unfreezeDie();
            dice2.unfreezeDie();
            dice3.unfreezeDie();
            dice4.unfreezeDie();
            dice5.unfreezeDie();
        }
        private void chooseFrozen()
        {
            System.out.print("Which dice would you like to freeze(1-5): ");
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();
            if(answer.contains("1")){
                dice1.freezeDie();
            }if (answer.contains("2")){
            dice2.freezeDie();
        }if (answer.contains("3")){
            dice3.freezeDie();
        }if (answer.contains("4")){
            dice4.freezeDie();
        }if (answer.contains("5")){
            dice5.freezeDie();
        }
        }

        /* Should print the value of all five dice separated by a tab (\t) to the console */
        private void printDice()
        {
            System.out.println(dice1.getValue() + "\t" + dice2.getValue() + "\t" + dice3.getValue() + "\t" + dice4.getValue() +  "\t" + dice5.getValue());
        }

        /* 1. Print a scoreboard
           2. Ask the user where they would like to mark their score.
           3. Call appropriate function
           4. If false is returned the user entered an invalid number, so ask the user to try again	*/
        private void markScore()
        {
            boolean b = false;
            Scanner s = new Scanner(System.in);
            while(!b){
                System.out.print("Where would you like to place your score? \n"
                        + "1. Ones     7.  3 of Kind \n" + "2. Twos     8.  4 of Kind \n"
                        + "3. Threes   9.  Full House \n" + "4. Fours    10. Sm Straight \n"
                        + "5. Fives    11. Lg Straight \n" + "6. Sixes    12. Yahtzee\n"
                        + "13. Chance \n" + "Enter 1-13:");
                String again  = s.nextLine();
                switch(again){
                    case "1":
                        b = scoreboard.markOnes(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "2":
                        b = scoreboard.markTwos(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "3":
                        b = scoreboard.markThrees(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "4":
                        b = scoreboard.markFours(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "5":
                        b = scoreboard.markFives(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "6":
                        b = scoreboard.markSixes(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "7":
                        b = scoreboard.markThreeOfAKind(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());;
                        break;
                    case "8":
                        b = scoreboard.markFourOfAKind(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "9":
                        b = scoreboard.markFullHouse(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "10":
                        b = scoreboard.markSmallStraight(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "11":
                        b = scoreboard.markLargeStraight(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "12":
                        b = scoreboard.markYahtzee(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                    case "13":
                        b = scoreboard.markChance(dice1.getValue(), dice2.getValue(), dice3.getValue(), dice4.getValue(), dice5.getValue());
                        break;
                }
            }
            scoreboard.printScoreCard();
        }
    }

