import java.util.Scanner;
import cs102.*;

/**
 * ConsoleHangman
 *
 * @author
 * @version 1.00 2013/4/7
 */

public class ConsoleHangman
{
    public static void main( String[] args)
	{

		char letter;
    	Scanner scan = new Scanner( System.in);

    	System.out.println( "Start of ConsoleHangman\n");

		// VARIABLES
		Hangman		hangman;

		// PROGRAM CODE
		hangman = new Hangman( new BasicSetup() );

		do{
			System.out.println("Letters known so far :- "+ hangman.getKnownSoFar());
			System.out.println();
        	System.out.println("You have " + (hangman.getMaxAllowedIncorrectTries()-hangman.getNumOfIncorrectTries()) + " tries left.");
        	System.out.println();
			letter = scan.nextLine().charAt(0);
			hangman.tryThis(letter);

		}
		while( !hangman.isGameOver());
		
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
