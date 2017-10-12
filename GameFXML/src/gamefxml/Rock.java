package gamefxml;

/**Class: Rock
 * @author Jarrod Bailey
 * Version 1.0
 * Course: ITEC 2140 Spring 2017 Section 6
 * Written: April 6, 2017
 * Rock class to implement RPS
 *
 */
public class Rock implements RPS {

	/**Method: Battle
	 * @param RPS other choice
	 * @return int
	 * Determines who wins rock paper scissors, overrides interface method
	 */
	@Override
	public int battle(RPS choice) {
		System.out.println("You picked Rock!\n");
		if (choice instanceof Rock)
		{
			System.out.println("It was a tie!\n");
			return 0;
		}
		else if (choice instanceof Paper)
		{
			System.out.println("You lost to paper!!\n");
			return -1;
		}
		else
		{
			System.out.println("You beat scissors!\n");
			return 1;
		}
	}

}
