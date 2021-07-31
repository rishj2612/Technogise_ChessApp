package main.peices;

import java.util.ArrayList;
import main.utils.ChessApplicationUtils;

public class King implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		int possibleXMoves[] = { 1, 1, 1, 0, -1, -1, 1, 0 };
		int possibleYMoves[] = { 1, 0, -1, -1, -1, 0, 1, 1 };
		ArrayList<String> possibleMoves = new ArrayList<String>();
		for (int i = 0; i < possibleXMoves.length; i++) {
			int movedXCoordinate = xCoordinate + possibleXMoves[i];
			int movedYCoordinate = yCoordinate + possibleYMoves[i];
			if (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
				possibleMoves
						.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			}
		}
		return possibleMoves;
	}
}
