package main.peices;

import java.util.ArrayList;

import main.exceptions.InvalidPeiceException;

public interface Peice {

	//returns list of possible coordinate based on calling type and input coordinates.
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
		case "ROOK":
			peice = new Rook();
			break;
		case "BISHOP":
			peice = new Bishop();
			break;
		case "QUEEN":
			peice = new Queen();
			break;
		default:
			throw new InvalidPeiceException();
		}
		return peice;
	}

}
