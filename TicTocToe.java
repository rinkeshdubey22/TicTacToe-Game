
import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TicToeTac Game");
		char [] Board = CreateBoard();
		showBoard(Board);
		PlayerMove(Board,userLetter);
		showBoard(Board);
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
	public static void showBoard(char[] Board) {
        System.out.println("Currently the Board Looks Like ");
        System.out.println(" ");
        System.out.println("\n "+ Board[1] + " | "+ Board[2] + " | " + Board[3]);
        System.out.println("-----------");
     	System.out.println(" "+ Board[4] + " | " + Board[5] + " | " + Board[6]);
        System.out.println("-----------");
        System.out.println(" "+ Board[7] + " | " + Board[8] + " | " + Board[9]);
        System.out.println(" ");
    	}
	public static void playerMove(char[] Board,char symbol) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index from 1 to 9 to make the move");
        int i=sc.nextInt();
        if(Board[i]==' ')
        {
            Board[i]=symbol;
        }
        else {
               System.out.println("Index is not free");
	}
  }
	public static char[] CreateBoard() {
		char[] Board = new char[10];
			for (int i = 1; i < Board.length; i++) {
				Board[i] = ' ';
			}
		return Board;
	}


}
