package gamefxml;

/**Class: Paper
 * @author Jarrod Bailey
 * Version 1.0
 * Course: ITEC 2140 Spring 2017 Section 6
 * Written: April 6, 2017
 * Paper class to implement RPS
 *
 */
public class Paper implements RPS {

	/**Method: Battle
	 * @param RPS other choice
	 * @return int
	 * Determines who wins rock paper scissors, overrides interface method
	 */
	@Override
	public int battle(RPS choice) {
		System.out.println("You picked Paper!\n");
		if (choice instanceof Paper)
		{
			System.out.println("It was a tie!\n");
			return 0;
		}
		else if (choice instanceof Scissors)
		{
			System.out.println("You lost to Scissors!!\n");
			return -1;
		}
		else
		{
			System.out.println("You beat rock!\n");
			return 1;
		}
	}

}
