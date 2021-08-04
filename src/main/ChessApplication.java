package main;

import java.util.Scanner;

import main.utils.Constants;

public class ChessApplication {

	// main Class
	public static void main(String[] args) {
		ChessBoard chessBoard = new ChessBoard();
		chessBoard.setPeiceCreator(new PeiceCreator());
		chessBoard.getPossibleCoordinates(getUserInput());
	}

	public static String getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		try {
			System.out.println(Constants.ENTER_PEICE_DETAILS);
			if (scanner.hasNext()) {
				userInput = scanner.nextLine();
			}
		} finally {
			scanner.close();
		}
		return userInput;
	}

}
