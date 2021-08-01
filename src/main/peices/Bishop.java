package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Bishop extends CompleteBoardTraversal implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		traverseDownwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwardsRight(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsRight(possibleMoves, xCoordinate, yCoordinate);
		return possibleMoves;
	}

}
