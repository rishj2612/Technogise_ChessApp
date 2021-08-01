package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Rook extends CompleteBoardTraversal implements Peice {
	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		traverseUpwards(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwards(possibleMoves, xCoordinate, yCoordinate);
		traverseLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseRight(possibleMoves, xCoordinate, yCoordinate);
		return possibleMoves;
	}

}
