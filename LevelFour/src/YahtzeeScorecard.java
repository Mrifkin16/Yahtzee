/**
 * Created by kirstenmrifkin on 12/15/15.
 */
public class YahtzeeScorecard {
    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int threeKind;
    private int fourKind;
    private int fiveKind;
    private int chance;
    private int fullHouse;
    private int smStraight;
    private int lgStraight;
    private boolean bonus;

    /* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */
    public YahtzeeScorecard() {
        YahtzeeGame game = new YahtzeeGame();
        ones = -1;
        twos = -1;
        threes = -1;
        fours = -1;
        fives = -1;
        sixes = -1;
        threeKind = -1;
        fourKind = -1;
        fiveKind = -1;
        chance = -1;
        fullHouse = -1;
        smStraight = -1;
        lgStraight = -1;
        bonus = false;
    }

    /* 1. If the field is already full, return false
       2. Set data value ones equal to number of ones rolled multiplied by one.
       3. Update the bonus (call updateBonus())
       4. Return true   */
    public boolean markOnes(int die1, int die2, int die3, int die4, int die5) {
        if (ones == -1) {
            int i = 0;
            if (die1 == 1) {
                i++;
            }
            if (die2 == 1) {
                i++;
            }
            if (die3 == 1) {
                i++;
            }
            if (die4 == 1) {
                i++;
            }
            if (die5 == 1) {
                i++;
            }
            ones = i * 1;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }


    /* 1. If the field is already full, return false
       2. Set data value twos equal to number of twos rolled multiplied by two.
       3. Update the bonus (call updateBonus())
       4. Return true   */
    public boolean markTwos(int die1, int die2, int die3, int die4, int die5) {
        if (twos == -1) {
            int i = 0;
            if (die1 == 2) {
                i++;
            }
            if (die2 == 2) {
                i++;
            }
            if (die3 == 2) {
                i++;
            }
            if (die4 == 2) {
                i++;
            }
            if (die5 == 2) {
                i++;
            }
            twos = i * 2;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }

    /* 1. If the field is already full, return false
       2. Set data value threes equal to number of threes rolled multiplied by three.
       3. Update the bonus (call updateBonus())
       4. Return true  */
    public boolean markThrees(int die1, int die2, int die3, int die4, int die5) {
        if (threes == -1) {
            int i = 0;
            if (die1 == 3) {
                i++;
            }
            if (die2 == 3) {
                i++;
            }
            if (die3 == 3) {
                i++;
            }
            if (die4 == 3) {
                i++;
            }
            if (die5 == 3) {
                i++;
            }
            threes = i * 3;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value fours equal to number of fours rolled multiplied by four.
       3. Update the bonus (call updateBonus())
       4. Returns true   */
    public boolean markFours(int die1, int die2, int die3, int die4, int die5) {
        if (fours == -1) {
            int i = 0;
            if (die1 == 4) {
                i++;
            }
            if (die2 == 4) {
                i++;
            }
            if (die3 == 4) {
                i++;
            }
            if (die4 == 4) {
                i++;
            }
            if (die5 == 4) {
                i++;
            }
            fours = i * 4;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value fives equal to number of fives rolled multiplied by five.
       3. Update the bonus (call updateBonus())
       4. Returns true   */
    public boolean markFives(int die1, int die2, int die3, int die4, int die5) {
        if (fives == -1) {
            int i = 0;
            if (die1 == 5) {
                i++;
            }
            if (die2 == 5) {
                i++;
            }
            if (die3 == 5) {
                i++;
            }
            if (die4 == 5) {
                i++;
            }
            if (die5 == 5) {
                i++;
            }
            fives = i * 5;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value sixes equal to number of sixes rolled multiplied by six.
       3. Update the bonus (call updateBonus())
       4. Returns true */
    public boolean markSixes(int die1, int die2, int die3, int die4, int die5) {
        if (sixes == -1) {
            int i = 0;
            if (die1 == 6) {
                i++;
            }
            if (die2 == 6) {
                i++;
            }
            if (die3 == 6) {
                i++;
            }
            if (die4 == 6) {
                i++;
            }
            if (die5 == 6) {
                i++;
            }
            sixes = i * 6;
            updateBonus();
            return true;
        } else {
            return false;
        }
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually three of the same value.
           If there are, set the data value threeKind to the value of all five dice.
           If there arenít set the value to 0.
              (Hint: use YahtzeeSortDice class!)
           4. Return true   */
    public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5)

    {
        if ((die1 == die2 && die2 == die3) || (die1 == die2 && die2 == die4) || (die1 == die2 && die2 == die5)
                || (die1 == die3 && die3 == die4) || (die1 == die3 && die3 == die5)
                || (die1 == die4 && die4 == die5)) {

            threeKind = die1 + die2 + die3 + die4 + die5;
            return true;
        } else {
            threeKind = 0;
            return false;
        }
    }


    /* 	1. If the field is already full, return false
        2. Check to see if there are actually four of the same value.
           If there are, set the data value fourKind to the value of all five dice.
           If there arenít set the value to 0;
           (Hint: use YahtzeeSortDice class!)
        4. Return true  */
    public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5) {
        YahtzeeSortDice s = new YahtzeeSortDice(die1, die2, die3, die4, die5);
        int first = s.getFirst();
        int second = s.getSecond();
        int third = s.getThird();
        int fourth = s.getFourth();
        int fifth = s.getFifth();
        if ((fourKind == -1) && ((first == second && first == third && second == fourth) || (second == third && second == fourth && second == fifth))) {
            fourKind = die1 + die2 + die3 + die4 + die5;
            return true;
        } else if (fourKind == -1) {
            fourKind = 0;
            return true;
        } else {
            return false;
        }
    }


    /* 1. If the field is already full, return false
       2. Check to see if there are actually three die with the same value, and two with another value.
          If there are, set the data value fullHouse to 25.
          If there arenít set the value to 0.
          (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
    public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5) {
        YahtzeeSortDice s = new YahtzeeSortDice(die1, die2, die3, die4, die5);
        int first = s.getFirst();
        int second = s.getSecond();
        int third = s.getThird();
        int fourth = s.getFourth();
        int fifth = s.getFifth();
        if ((fullHouse == -1) && ((first == second && fifth == third && third == fourth) || (second == third && first == fourth && fourth == fifth)
                || (first == third && second == fourth && fourth == fifth) || (first == fourth && second == third && third == fifth) || (fifth == first && second == third && third == fourth)
                || (second == fourth && first == third && third == fifth) || (second == fifth && first == third && third == fourth) ||
                (third == fourth && first == second && second == fifth) || (third == fifth && first == second && first == fourth) || (fourth == fifth && first == second && second == third))) {
            fullHouse = 25;
            return true;
        } else if (fourKind == -1) {
            fourKind = 0;
            return true;
        } else {
            return false;
        }
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually four consecutive dice numbers.
           If there are, set the data value smStraight to 30.
           If there arenít set the value to 0.
           (Hint: Use YahtzeeSortedDice class)
        4. Return true  */
    public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
    {
        YahtzeeSortDice sd = new YahtzeeSortDice(die1, die2, die3, die4, die5);
        int first = sd.getFirst();
        int second = sd.getSecond();
        int third = sd.getThird();
        int fourth = sd.getFourth();
        int fifth = sd.getFifth();
        if(smStraight != -1){
            if((first == 1 && second == 2 && third == 3 && fourth == 4) ||
                    (second == 3 && third == 4  && fourth == 5 && fifth == 6) ||
                    (first == 2 && second == 3 && third == 4 && fourth == 5)){
                smStraight = 30;
                return true;
            }
            else {
                smStraight = 0;
                return true;
            }
        }
        else {
            return false;
        }
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually five consecutive dice numbers.
           If there are, set the data value lgStraight to 40.
           If there arenít set the value to 0;
           (Hint: use YahtzeeSortDice class!)
        3. Return true  */
    public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5) {
        YahtzeeSortDice s = new YahtzeeSortDice(die1, die2, die3, die4, die5);
        int first = s.getFirst();
        int second = s.getSecond();
        int third = s.getThird();
        int fourth = s.getFourth();
        int fifth = s.getFifth();
        if (lgStraight == -1 && ((fifth > fourth && fourth > third && third > second && second > first)) || (fifth < fourth && fourth < third && third < second && second < first)) {
            lgStraight = 40;
            return true;
        } else {
            return false;
        }
    }



        /* 1. If the field is already full, return false
           2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there arenít set the value to 0;
           3. Return true   */
        public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5) {
            if (fiveKind == -1 && (die1 == die2 && die2 == die3 && die3 == die4 && die4 == die5)) {
                fiveKind = 50;
                return true;
            } else {
                return false;
            }
        }

        /* 1. If the field is already full, return false
           2. Set the data value chance to the value of all five dice.
           3. Return true  */
        public boolean markChance(int die1, int die2, int die3, int die4, int die5)
        {
		    if(chance == -1){
            chance = die1+die2+die3+die4+die5;
                return true;
        }
            return false;
        }

        /* 	1. If the bonus has already been assigned, do nothing
            2. If the upper sectionís total is 63 or greater, set the data value bonus to true */
        private void updateBonus()
        {
            if((ones+twos+threes+fours+fives+sixes)>=63){
                bonus=true;
            }
        }

        /* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
        public int getUpperTotal()
        {
            int total=0;
            if(ones==-1){
                total++;
            } else if(twos==-1){
                total++;
            } else if(threes==-1){
            total++;
            }else if(fours==-1) {
                total++;
            }else if(fives==-1) {
                total++;
            }else if(sixes==-1) {
                total++;
            }
            return ((ones+twos+threes+fours+fives+sixes)+total);
        }

        /* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
        public int getLowerTotal()
        {
            int total=0;
            if(fullHouse==-1){
                total++;
            } else if(threeKind==-1){
                total++;
            } else if(fourKind==-1){
                total++;
            }else if(fiveKind==-1) {
                total++;
            }else if(smStraight==-1) {
                total++;
            }else if(lgStraight==-1) {
                total++;
            }
            return ((fullHouse+threeKind+fourKind+fiveKind+smStraight+lgStraight)+total);
        }

        /* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
        public int getGrandTotal()
        {
            int total=0;
            if(fullHouse==-1){
                total++;
            } else if(threeKind==-1){
                total++;
            } else if(fourKind==-1){
                total++;
            }else if(fiveKind==-1) {
                total++;
            }else if(smStraight==-1) {
                total++;
            }else if(lgStraight==-1) {
                total++;
            }
            else if(ones==-1){
                total++;
            } else if(twos==-1){
                total++;
            } else if(threes==-1){
                total++;
            }else if(fours==-1) {
                total++;
            }else if(fives==-1) {
                total++;
            }else if(sixes==-1) {
                total++;
            }

            return ((fullHouse+threeKind+fourKind+fiveKind+smStraight+lgStraight+ones+twos+threes+fours+fives+sixes)+total);
        }

        /*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
            Sample:
            **********************************
            *  	    Yahtzee Score Card		 *
            *  					`		  	 *
            * 	Ones:				__		 *
            * 	Twos:				__		 *
            * 	Threes:				__		 *
            * 	Fours:				__		 *
            * 	Fives:				25		 *
            * 	Sixes:				__		 *
            *								 *
            *	Upper Bonus:		 0		 *
            * 	Upper Total:   		25		 *
            *								 *
            *	3 of Kind:			__		 *
            * 	4 of Kind:			__		 *
            * 	Full House:			25		 *
            * 	Sm Straight:		__		 *
            * 	Lg  Straight:		__		 *
            * 	Yahtzee:	  		 0		 *
            * 	Chance:				__		 *
            *								 *
            * 	Lower Total:		25		 *
            *								 *
            * 	Grand Total:		50		 *
            **********************************
            already implemented
        */
        public void printScoreCard()
        {
            System.out.println();
            System.out.println("*********************************");
            System.out.println("*      Yahtzee Score Card       *");
            System.out.println("*                               *");
            System.out.print("*  Ones:\t\t");
            if(ones==-1)System.out.print("__");
            else System.out.print(ones);
            System.out.println("\t*");
            System.out.print("*  Twos:\t\t");
            if(twos==-1)System.out.print("__");
            else System.out.print(twos);
            System.out.println("\t*");
            System.out.print("*  Threes:\t\t");
            if(threes==-1)System.out.print("__");
            else System.out.print(threes);
            System.out.println("\t*");
            System.out.print("*  Fours:\t\t");
            if(fours==-1)System.out.print("__");
            else System.out.print(fours);
            System.out.println("\t*");
            System.out.print("*  Fives:\t\t");
            if(fives==-1)System.out.print("__");
            else System.out.print(fives);
            System.out.println("\t*");
            System.out.print("*  Sixes:\t\t");
            if(sixes==-1)System.out.print("__");
            else System.out.print(sixes);
            System.out.println("\t*");
            System.out.println("*\t\t\t\t*");
            System.out.print("*  Upper Bonus:\t\t");
            if(bonus)System.out.print("35");
            else System.out.print("0");
            System.out.println("\t*");
            System.out.print("*  Upper Total:\t\t");
            System.out.print(this.getUpperTotal());
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  3 of Kind:\t\t");
            if(threeKind==-1)System.out.print("__");
            else System.out.print(threeKind);
            System.out.println("\t*");
            System.out.print("*  4 of Kind:\t\t");
            if(fourKind==-1)System.out.print("__");
            else System.out.print(fourKind);
            System.out.println("\t*");
            System.out.print("*  Full House:\t\t");
            if(fullHouse==-1)System.out.print("__");
            else System.out.print(fullHouse);
            System.out.println("\t*");
            System.out.print("*  Sm Straight:\t\t");
            if(smStraight==-1)System.out.print("__");
            else System.out.print(smStraight);
            System.out.println("\t*");
            System.out.print("*  Lg Straight:\t\t");
            if(lgStraight==-1)System.out.print("__");
            else System.out.print(lgStraight);
            System.out.println("\t*");
            System.out.print("*  Yahtzee:\t\t");
            if(fiveKind==-1)System.out.print("__");
            else System.out.print(fiveKind);
            System.out.println("\t*");
            System.out.print("*  Chance:\t\t");
            if(chance==-1)System.out.print("__");
            else System.out.print(chance);
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  Lower Total:\t\t");
            System.out.print(this.getLowerTotal());
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  Grand Total:\t\t");
            System.out.print(this.getGrandTotal());
            System.out.println("\t*");
            System.out.println("**********************************");
            System.out.println();
        }


    }



