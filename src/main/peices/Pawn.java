package main.peices;

import java.util.ArrayList;
import main.utils.ChessApplicationUtils;

public class Pawn implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		int movedXCoordinate = xCoordinate + 0;
		int movedYCoordinate = yCoordinate + 1;
		if (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
		}
		return possibleMoves;
	}
}
