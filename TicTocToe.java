
import java.util.Scanner;
import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TicToeTac Game");
		char [] Board = CreateBoard();
		char userLetter = chooseLetter();
		char computerLetter;
		if(userLetter=='X') {
			computerLetter = '0';
		}
		else {
			computerLetter = 'X';
		}
		System.out.println("Computer Letter is: " + computerLetter+" User Letter is : " + userLetter);

	}
	public static char chooseLetter()
	{
        	char symbol;
        	Scanner UserInput = new Scanner(System.in);
        	System.out.print("Enter your symbol");
        	symbol=UserInput.next().toUpperCase().charAt(0);
        	return symbol;
    	}
		public static char [] CreateBoard() {
			char[] Board = new char[10];
			for (int i = 0; i < Board.length; i++) {
				Board[i] = ' ';
			}
		return Board;
	}


	



}
