/**
 * Lab_05_a Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 16/07/2021
 */

import cs102.IHangmanSetup;

public class BasicSetup implements IHangmanSetup
{
	private static String[] words = { "Broken", "Magical", "I","JRobo is the best", "amazing","cool", "David", "Incredible" };



	/**
     * @return max incorrect tries
     */
	public int getMaxAllowedIncorrectTries()
	{
		return 6;
	}


	/**
     * @return char as *
     */
	public char	getBlankChar()
	{
		return '*';
	}


	
	/**
     * @return empty string
     */
	public String getCharsToPreserve()
	{
		return " ";
	}


	/**
     * @return all letters
     */
	public String getAllLetters()
	{
		return "abcdefghijklmnopqrstuvwxyz";
	}


	/**
     * @return empty string as ***
     */
	public String chooseSecretWord()
	{
		int random = (int) (Math.random() * words.length );
		return words[ random];
	}
}