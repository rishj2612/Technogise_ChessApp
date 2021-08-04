package main.utils;

public class ChessApplicationUtils {

	// Checks if coordinate is valid or not
	public static boolean checkValidCoordinateFromUserInput(String userInputCoordinate) {
		int y = convertFromUserInputCoordinate(userInputCoordinate, Coordinate.Y);
		int x = convertFromUserInputCoordinate(userInputCoordinate, Coordinate.X);
		return checkValidCoordinateFromInteger(x, y);
	}

	// Converts coordinate to int from userReadable format
	public static int convertFromUserInputCoordinate(String userInputCoordinate, Coordinate coordinateType) {
		if (coordinateType == Coordinate.X) {
			return Integer.parseInt(userInputCoordinate.substring(1, 2));
		} else
			return userInputCoordinate.substring(0, 1).toCharArray()[0];
	}

	// Check if coordinate is on the chess board or not
	public static boolean checkValidCoordinateFromInteger(int xCoordinate, int yCoordinate) {
		if ((xCoordinate < Constants.MIN_X_COORDINATE_VAL || xCoordinate > Constants.MAX_X_COORDINATE_VAL)
				|| (yCoordinate > Constants.MAX_Y_COORDINATE_VAL || yCoordinate < Constants.MIN_Y_COORDINATE_VAL)) {
			return false;
		} else {
			return true;
		}
	}

	// Convert coordinate from int to userreadable string
	public static String convertToUserInputCoordinate(int x, int y) {
		return ((char) y) + Integer.toString(x);
	}
}
