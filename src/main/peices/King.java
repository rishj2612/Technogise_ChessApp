package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class King extends CompleteBoardTraversal implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		int possibleXMoves[] = { 1, 1, 1, 0, -1, -1, 1, 0 };
		int possibleYMoves[] = { 1, 0, -1, -1, -1, 0, 1, 1 };
		return traverseUsingTraversalCoordinatesList(possibleXMoves, possibleYMoves, xCoordinate, yCoordinate);
	}
}
