
import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		System.out.println("Welcome to TicToeTac Game");
		char [] Board = CreateBoard();

	}
		public static char [] CreateBoard() {
			char[] Board = new char[10];
			for (int i = 0; i < Board.length; i++) {
				Board[i] = ' ';
			}
		return Board;
	}


}
