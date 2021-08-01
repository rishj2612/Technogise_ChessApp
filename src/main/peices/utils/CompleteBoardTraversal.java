package main.peices.utils;

import java.util.ArrayList;

import main.utils.ChessApplicationUtils;

public class CompleteBoardTraversal {

	// sets possible moves for Bishop
	protected void getPossibleMovedForBishop(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		traverseDownwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwardsRight(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseUpwardsRight(possibleMoves, xCoordinate, yCoordinate);
	}

	// sets all possible moved for Rook
	protected void getPossibleMovedForRook(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		traverseUpwards(possibleMoves, xCoordinate, yCoordinate);
		traverseDownwards(possibleMoves, xCoordinate, yCoordinate);
		traverseLeft(possibleMoves, xCoordinate, yCoordinate);
		traverseRight(possibleMoves, xCoordinate, yCoordinate);
	}

	// for traversing upwards in the board
	private void traverseUpwards(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate + 1;
		}
	}

	// for traversing Downwards in the board
	private void traverseDownwards(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate - 1;
		}
	}

	// for traversing Left in the board
	private void traverseLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Right in the board
	private void traverseRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
		}
	}

	// for traversing Diagonally down and left in the board
	private void traverseDownwardsLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate - 1;
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Diagonally up and left in the board
	private void traverseUpwardsLeft(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate - 1;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedYCoordinate = movedYCoordinate + 1;
			movedXCoordinate = movedXCoordinate - 1;
		}
	}

	// for traversing Diagonally up and right in the board
	private void traverseUpwardsRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate + 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
			movedYCoordinate = movedYCoordinate + 1;
		}
	}

	// for traversing Diagonally down and right in the board
	private void traverseDownwardsRight(ArrayList<String> possibleMoves, int xCoordinate, int yCoordinate) {
		int movedXCoordinate = xCoordinate + 1;
		int movedYCoordinate = yCoordinate - 1;
		while (ChessApplicationUtils.checkValidCoordinateFromInteger(movedXCoordinate, movedYCoordinate)) {
			possibleMoves.add(ChessApplicationUtils.convertToUserInputCoordinate(movedXCoordinate, movedYCoordinate));
			movedXCoordinate = movedXCoordinate + 1;
			movedYCoordinate = movedYCoordinate - 1;
		}
	}
}
