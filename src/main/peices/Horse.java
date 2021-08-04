package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Horse extends CompleteBoardTraversal implements Peice {

	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		int possibleXMoves[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int possibleYMoves[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		return traverseUsingTraversalCoordinatesList(possibleXMoves, possibleYMoves, xCoordinate, yCoordinate);
	}
}
