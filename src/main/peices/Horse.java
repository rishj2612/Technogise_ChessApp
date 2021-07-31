package main.peices;

import java.util.ArrayList;
import main.utils.ChessApplicationUtils;

public class Horse implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		int possibleXMoves[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int possibleYMoves[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
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
