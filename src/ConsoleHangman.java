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

import java.util.Scanner;
import cs102.*;

public class ConsoleHangman
{
    public static void main( String[] args)
	{

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman		hangman;
		char letter;


		Scanner scan = new Scanner( System.in);


		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );


		//do-while statement to play the game
		do{
			System.out.println("Letters known so far :- "+ hangman.getKnownSoFar());
			System.out.println();
        	System.out.println("You have " + (hangman.getMaxAllowedIncorrectTries()-hangman.getNumOfIncorrectTries()) + " tries left.");
        	System.out.println();
			letter = scan.nextLine().charAt(0);
			hangman.tryThis(letter);

		}
		while( !hangman.isGameOver());
		

		//conditionals displaying the win loss messages
		if(hangman.hasLost()){
			System.out.println();
            System.out.println("You have lost. Better luck next time :)");
			System.out.println();
			System.out.println("The word was:- " + hangman.getKnownSoFar());
			System.out.println();
		}
		else{
			System.out.println();
            System.out.println("You have won. Well played.");
			System.out.println();
		}

		System.out.println( "\nEnd of ConsoleHangman\n" );
	}

} // end of class ConsoleHangman
