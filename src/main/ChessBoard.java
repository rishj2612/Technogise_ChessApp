package main;

import java.util.ArrayList;

import main.exceptions.InvalidPeiceException;
import main.peices.Peice;
import main.utils.ChessApplicationUtils;

public class ChessBoard {

	static void getPossibleCoordinates(String userInput) {
		String userInputs[] = userInput.split(" ");
		String peiceName = userInputs[0];
		String peiceLocation = userInputs[1];
		try {
			Peice peice = Peice.createPeice(peiceName);
			boolean validCoordinate = ChessApplicationUtils.checkValidCoordinateFromUserInput(peiceLocation);
			if (validCoordinate) {
				ArrayList<String> possibleMoves = peice.getPossibleCoordinates(peiceLocation);
				System.out.println(possibleMoves);
			} else {
				System.out.println("Peice location " + peiceLocation + " entered is invalid");
			}
		} catch (InvalidPeiceException e) {
			System.out.println("Peice " + peiceName + " entered is invalid.");
		}

	}
}
