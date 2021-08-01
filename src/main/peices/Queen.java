package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Queen extends CompleteBoardTraversal implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		traverseLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseRight(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwards(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwards(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsRight(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwardsRight(possibleMoves, xCoordinate, yCoordinate);
		return possibleMoves;
	}

}
