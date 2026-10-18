package dwolf.project_battleship.stage_1Of6;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.Scanner;

class Battleship {
	public Battleship() {
		printBoard();
		System.out.println("Enter the coordinates of the ship:");
		String userInput = "D2 D8";
		Scanner scanner = new Scanner(System.in);
		//        String userInput = " ";
		//        userInput = scanner.nextLine().toUpperCase();
		final String VALID_USER_INPUT_PATTERN = "^[A-J](10|[1-9])\\s[A-J](10|[1-9])$";
		Pattern pattern = Pattern.compile(VALID_USER_INPUT_PATTERN);
		Matcher matcher = pattern.matcher(userInput);

		if (!matcher.matches()) {
			errorMessageAndQuit(scanner);
		}

		/* The ASCII character code (int representation) for 'A' is 65
		 * The first index of an array is 0.
		 * Because of this, subtracting 65 from the int representation will result in the correct index.
		 */

		int row1 = (int) userInput.split(" ")[0].charAt(0) - 65;
		String tempStr = userInput.split(" ")[0].substring(1);
		int col1 = Integer.parseInt(tempStr) - 1;

		int row2 = (int) userInput.split(" ")[1].charAt(0) - 65;
		tempStr = userInput.split(" ")[1].substring(1);
		int col2 = Integer.parseInt(tempStr) - 1;

		boolean isHorizontal = row1 == row2 ^ col1 == col2; // false = vertical


		/*
		 * if row1 == row2 then row1 is fixed
		 * if col1 < col2 then y is to increment
		 * else y decrement
		 *
		 * if col1 == col2 then col1 is fiyed
		 * if row1 < row2 then x is to increment
		 * else x decrement
		 *
		 * D
		 * increment
		 *
		 * row1 fixed
		 * 3,4 3,5 3,6 3,7
		 * 3,7 3,6 3,5 3,4
		 *
		 * col1 fixed
		 * 1,9 2,9 3,9 4,9
		 * 4,9 3,9 2,9 1,9
		 *
		 * */

		char fixedChar = ' ';
		char variableChar = ' ';
		boolean isIncrement = true;
		int length = 0;

		if (row1 == row2) {
			length = Math.abs(col1 - col2) + 1;

		} else {
			length = Math.abs(row1 - row2) + 1;
		}
		System.out.println("Length: " + length);

		if (row1 == row2) {
			fixedChar = (char) (row1 + 65);
			if (col1 < col2) {
				variableChar = (char) (col1 + 65);
				isIncrement = true;
			} else {
				variableChar = (char) (col2 + 65);
				isIncrement = false;
			}
		}

		if (col1 == col2) {
			fixedChar = (char) (col1 + 65);
			if (row1 < row2) {
				variableChar = (char) (row1 + 65);
				isIncrement = true;
			} else {
				variableChar = (char) (row2 + 65);
				isIncrement = false;
			}

		}
	}

	private void printBoard() {
		System.out.print(" ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(" ");
			System.out.print(i);
		}
		System.out.println();

		char rowLetter = 'A';

		for (int i = 0; i <= 9; i++) {
			System.out.print(rowLetter);
			for (int j = 0; j <= 9; j++) {
				System.out.print(" " + "~");
			}
			System.out.println();
			rowLetter++;
		}
	}

	private void errorMessageAndQuit(Scanner scanner) {
		scanner.close();
		System.out.println("Error!");
		System.exit(0);
	}

	public static void main(String[] args) {
		new Battleship();
	}

}


/*
 *
 *       //////////////////// Example Game Map //////////////////
 *       ~ water
 *       M miss
 *       O ship
 *       X hit
 *            1  2  3  4  5  6  7  8  9  10
 *            0  1  2  3  4  5  6  7  8  9
 *       A 0  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       B 1  ~  M  ~  M  ~  ~  O  ~  ~  ~
 *       C 2  ~  ~  M  ~  ~  ~  O  ~  ~  ~
 *       D 3  ~  ~  ~  M  ~  ~  O  ~  ~  ~
 *       E 4  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       F 5  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       G 6  ~  ~  O  O  X  O  O  ~  ~  ~
 *       H 7  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       I 8  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 *       J 9  ~  ~  ~  ~  ~  ~  ~  ~  ~  ~
 */
