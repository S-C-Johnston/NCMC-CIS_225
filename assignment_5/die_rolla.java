
/**
 * A class for a dice roller which rolls exploding dice consecutively
 * until a target number is reached. It does not accumulate seperate
 * rolls.
 *
 * @author (Stewart Johnston)
 * @version (2019-03-19.01)
 */

import java.util.Random;
public class Die_rolla
{
    // instance variables - replace the example below with your own
    private int die_size, num_dice, target_num;

    /**
     * Constructor for objects of class die_rolla
     */
    public Die_rolla(int die_size, int num_dice, int target_num)
    {
        this.die_size = die_size;
        this.num_dice = num_dice;
        this.target_num = target_num;
    }

    /**
     * Roll a die and return a number between 1 and the die-size
     *
     * @return  Number between 1 and die-size, inclusive
     */
    public int roll_die()
    {
        Random random = new Random();
        return (random.nextInt(this.die_size) + 1);
    }
}
