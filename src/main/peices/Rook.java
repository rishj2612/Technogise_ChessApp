package main.peices;

import java.util.ArrayList;

import main.peices.utils.CompleteBoardTraversal;

public class Rook extends CompleteBoardTraversal implements Peice {
	public ArrayList<String> generatePossibleCoordinates(int xCoordinate, int yCoordinate) {
		ArrayList<String> possibleMoves = new ArrayList<String>();
		getPossibleMovedForRook(possibleMoves, xCoordinate, yCoordinate);
		return possibleMoves;
	}

}
