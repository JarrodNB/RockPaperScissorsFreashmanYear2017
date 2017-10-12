package gamefxml;

/**Class: Scissors
 * @author Jarrod Bailey
 * Version 1.0
 * Course: ITEC 2140 Spring 2017 Section 6
 * Written: April 6, 2017
 * Scissors class to implement RPS
 *
 */
public class Scissors implements RPS {

	/**Method: Battle
	 * @param RPS other choice
	 * @return int
	 * Determines who wins rock paper scissors, overrides interface method
	 */
	@Override
	public int battle(RPS choice) {
		System.out.println("You picked scissors!\n");
		if (choice instanceof Scissors)
		{
			System.out.println("It was a tie!\n");
			return 0;
		}
		else if (choice instanceof Rock)
		{
			System.out.println("You lost to rock!!\n");
			return -1;
		}
		else
		{
			System.out.println("You beat paper!\n");
			return 1;
		}
	}

}
