package main;

import java.util.ArrayList;

import main.exceptions.InvalidPeiceException;
import main.peices.Peice;
import main.utils.ChessApplicationUtils;
import main.utils.Constants;
import main.utils.Coordinate;

public class ChessBoard {

	private PeiceCreator peiceCreator;

	public void getPossibleCoordinates(String userInput) throws ArrayIndexOutOfBoundsException {
		try {
			String userInputs[] = userInput.split(" ");
			String peiceName = userInputs[0];
			String peiceLocation = userInputs[1];
			try {
				Peice peice = peiceCreator.createPeice(peiceName);
				boolean validCoordinate = ChessApplicationUtils.checkValidCoordinateFromUserInput(peiceLocation);
				if (validCoordinate) {
					int xCoordinate = ChessApplicationUtils.convertFromUserInputCoordinate(peiceLocation, Coordinate.X);
					int yCoordinate = ChessApplicationUtils.convertFromUserInputCoordinate(peiceLocation, Coordinate.Y);
					ArrayList<String> possibleMoves = peice.generatePossibleCoordinates(xCoordinate, yCoordinate);
					System.out.println(possibleMoves);
				} else {
					System.out.println("Peice location " + peiceLocation + " entered is invalid");
				}
			} catch (InvalidPeiceException e) {
				System.out.println("Peice " + peiceName + " entered is invalid.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(Constants.PLEASE_PROVICE_CORRECT_PEICE_DETAILS);
		} catch (NumberFormatException e) {
			System.out.println(Constants.PLEASE_PROVICE_CORRECT_PEICE_DETAILS);
		}
	}

	public void setPeiceCreator(PeiceCreator priceCreator) {
		this.peiceCreator = priceCreator;
	}
}
