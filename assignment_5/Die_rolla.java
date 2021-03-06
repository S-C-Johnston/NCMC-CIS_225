
/**
 * A class for a dice roller which rolls exploding dice consecutively
 * until a target number is reached. It does not accumulate seperate
 * rolls.
 *
 * @author (Stewart Johnston)
 * @version (2019-03-26.1)
 */

import java.util.Random;
public class Die_rolla
{
    // instance variables - replace the example below with your own
    private int die_size, num_dice, target_num;
    private static final int default_size = 6,
            max_num = 10,
            min_num = 1,
            default_num = 1,
            min_target = 5,
            max_target = 30,
            default_target = 5;

    /**
     * Constructor for objects of class die_rolla
     */
    public Die_rolla(int die_size, int num_dice, int target_num)
    {
        set_die_size(die_size);
        set_num_dice(num_dice);
        set_target(target_num);
    }

    /**
     * Returns numeric size of die
     *
     * @return  int size of die
     */
    public int die_size()
    {
        return die_size;
    }

    /**
     * Returns number of dice
     *
     * @return  int number of dice
     */
    public int num_dice()
    {
        return num_dice;
    }

    /**
     * Returns target number
     *
     * @retrun  int target number
     */
    public int target_num()
    {
        return target_num;
    }

    /**
     * Set the die_size; if new_size is not in desired range, default to
     * the default_size constant, which at this time is 6.
     *
     */
    public void set_die_size(int new_size)
    {
        switch (new_size) {
            case 4: this.die_size = 4;
                    break;
            case 6: this.die_size = 6;
                    break;
            case 8: this.die_size = 8;
                    break;
            case 10: this.die_size = 10;
                     break;
            case 12: this.die_size = 12;
                     break;
            case 20: this.die_size = 20;
                     break;
            case 100: this.die_size = 100;
                      break;
            default: this.die_size = this.default_size;
                     break;
        }
    }

    /**
     * Assign new number of dice to roll, between the minimum and
     * maximum, otherwise will default to 1 die.
     *
     * @param   int new number of dice.
     */
    public void set_num_dice(int new_num)
    {
        if (min_num <= new_num && new_num <= max_num) {
            this.num_dice = new_num;
        }
        else {
            this.num_dice = default_num;
        }
    }

    /**
     * Set new target to reach when rolling against. Must be in range,
     * otherwise set to default
     *
     * @param   int new target to roll against
     */
    public void set_target(int new_target)
    {
        if (min_target <= new_target && new_target <= max_target) {
            this.target_num = new_target;
        }
        else {
            this.target_num = default_target;
        }
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

    /**
     * Roll dice in sequence until either a success occurs, a critical
     * failure occurs (too many ones get rolled) or we run out of dice
     * to roll.
     *
     * @return  boolean if success was had
     */
    public boolean roll_against_target() { boolean success; int result,
        total = 0, attempts = 0, ones_count = 0;

        do{
            result = roll_die();
            total += result;

            if (total >= this.target_num) {
                return success = true;
            }

            if (result == die_size) {
                continue;
                //Explode the die if it hits the maximum value it can.
            }

            total = 0;

            if (1 == result) {
                ones_count++;
                if (ones_count > (die_size / 2)) {
                    return success = false;
                }
            }

            attempts++;
        } while (attempts < this.num_dice);
        return success = false;
    }
}
