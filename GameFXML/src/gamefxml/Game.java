package gamefxml;

import java.util.Random;

/**Class: Game
 * @author Jarrod Bailey
 * Version 1.0
 * Course: ITEC 2140 Spring 2017 Section 6
 * Written: April 6, 2017
 * This class contains methods for the application
 *
 */
public class Game {
	
	private final int ROCK = 0;
	private final int PAPER = 1;
	private final int SCISSORS = 2;
	
        /**
	 * Method: randomComputerChoice
	 * @param none
	 * @return RPS
	 * Returns random rps object
	 *
	 */
	public RPS randomComputerChoice()
	{
		Random random = new Random();
		return rpsFactory(random.nextInt(3));
	}
	
        /**
	 * Method: rpsFactory
	 * @param index
	 * @return RPS
	 * Generates RPS object off of index
	 *
	 */
	private RPS rpsFactory(int index)
	{
		switch (index)
		{
			case ROCK: return new Rock();
			case PAPER: return new Paper();
			case SCISSORS: return new Scissors();
		}
		return new Rock();
	}
}
