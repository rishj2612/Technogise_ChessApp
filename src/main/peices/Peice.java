package main.peices;

import java.util.ArrayList;

import main.exceptions.InvalidPeiceException;

public interface Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate);

	public static Peice createPeice(String peiceName) throws InvalidPeiceException {
		Peice peice = null;
		switch (peiceName.toUpperCase()) {
		case "KING":
			peice = new King();
			break;
		case "PAWN":
			peice = new Pawn();
			break;
		case "HORSE":
			peice = new Horse();
			break;
		default:
			throw new InvalidPeiceException();
		}
		return peice;
	}

}
