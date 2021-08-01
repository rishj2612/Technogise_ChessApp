package main;

public class ChessApplication {

	public static void main(String[] args) {
		try {
			ChessBoard.getPossibleCoordinates(args[0]);
			System.out.print(false);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(
					"Please provide command line arguments as \"Peicename PeiceLocation\" example: \"King H5\".");
		}
	}

}
