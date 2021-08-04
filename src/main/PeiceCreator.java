package main;

import main.exceptions.InvalidPeiceException;
import main.peices.Bishop;
import main.peices.Horse;
import main.peices.King;
import main.peices.Pawn;
import main.peices.Peice;
import main.peices.Queen;
import main.peices.Rook;

public class PeiceCreator {

	public Peice createPeice(String peiceName) throws InvalidPeiceException {
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
