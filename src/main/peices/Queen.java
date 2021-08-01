package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Queen extends CompleteBoardTraversal implements Peice {

	//Queen is mixture of rook and bishop and utilising there methods
	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		getPossibleMovedForRook(possibleMoves, xCoordinate, yCoordinate);
		getPossibleMovedForBishop(possibleMoves, xCoordinate, yCoordinate);
		return possibleMoves;
	}

}
