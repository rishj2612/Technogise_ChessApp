package main;

import java.util.Scanner;

import main.utils.Constants;

public class ChessApplication {

	//main Class
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(Constants.ENTER_PEICE_DETAILS);
			String product = scanner.nextLine();
			ChessBoard.getPossibleCoordinates(product);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(Constants.PLEASE_PROVICE_CORRECT_PEICE_DETAILS);
		}
		finally{
			scanner.close();
		}
	}

}
