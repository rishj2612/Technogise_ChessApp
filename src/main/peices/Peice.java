package main.peices;

import java.util.ArrayList;

import main.exceptions.InvalidPeiceException;

public interface Peice {

	public ArrayList<String> getPossibleCoordinates(String userInputCoordinate);

	public static Peice createPeice(String peiceName) throws InvalidPeiceException {
		Peice peice = null;
		switch (peiceName) {
		case "King":
			peice = new King();
			break;
		default:
			throw new InvalidPeiceException();
		}
		return peice;
	}

}
