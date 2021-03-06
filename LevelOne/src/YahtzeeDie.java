/**
 * Created by kirstenmrifkin on 12/13/15.
 */
import java.util.*;import java.util.Random;
public class YahtzeeDie {

	/* instance data should include a Random number generator, a numOfSides which
	contains the number of sides the die has, value which is the current value
	of the die and isFrozen	which is true if die is frozen, false if not */

        private Random r;
        private int numOfSides;
        private int value;
        private boolean isFrozen;

        /* initialize the Random object appropriately, initialize an int containing the value to 0,
        a boolean isFrozen to false and numOfSides to the argument passed in */
        public YahtzeeDie(int sides)
        {
            this.numOfSides = 6;
            this.isFrozen = false;
           this.value = 0;
            this.r=new Random();

        }

        /* Set the new value for the die using the Random object */
        public void rollDie()
        {
            this.value = r.nextInt(numOfSides)+1;
        }

        /* Gets the current die value */
        public int getValue()
        {
            return value;

        }

        /* Set the value of isFrozen to true */
        public void freezeDie()
        {
            this.isFrozen = true;
        }

        /* Set the value of isFrozen to false */
        public void unfreezeDie()
        {
            this.isFrozen=false;
        }

        /* Return true if die is frozen, false if it is unfrozen */
        public boolean isFrozen()
        {
            if(isFrozen==true){
                return true;
            }else{
                return false;
            }

        }

    }

