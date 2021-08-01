package main.peices.utils;

import java.util.ArrayList;

import main.utils.ChessApplicationUtils;

public class CompleteBoardTraversal {

	// for traversing upwards in the board
	protected void traverseUpwards(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate + 1;
		}
	}

	// for traversing Downwards in the board
	protected void traverseDownwards(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate - 1;
		}
	}

	// for traversing Left in the board
	protected void traverseLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Right in the board
	protected void traverseRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
		}
	}

	// for traversing Diagonally down and left in the board
	protected void traverseDownwardsLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate - 1;
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Diagonally up and left in the board
	protected void traverseUpwardsLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate + 1;
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Diagonally up and right in the board
	protected void traverseUpwardsRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
			movedYCoordinate = movedYCoordinate + 1;
		}
	}

	// for traversing Diagonally down and right in the board
	protected void traverseDownwardsRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
			movedYCoordinate = movedYCoordinate - 1;
		}
	}
}
