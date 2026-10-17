import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Battleship {
	public Battleship() {
		printBoard();

		System.out.println("Enter the coordinates of the ship:");
		String userInput = "D2 D8";
		//        String userInput = " ";
		//        Scanner scanner = new Scanner(System.in);
		//        userInput = scanner.nextLine().toUpperCase();
		final String VALID_USER_INPUT_PATTERN = "^[A-J](10|[1-9])\\s[A-J](10|[1-9])$";
		Pattern pattern = Pattern.compile(VALID_USER_INPUT_PATTERN);
		Matcher matcher = pattern.matcher(userInput);
		if (!matcher.matches()) {
			System.out.println("Error!");
			return;
		}

		ArrayList<Integer> indexes = inputToIndexes(userInput);

		boolean isHoriOrVerti = indexes.get(0).equals(indexes.get(2)) ^ indexes.get(1).equals(indexes.get(3));

		/*
		 * 3,1 3,9
		 * 3,9 3,1
		 *
		 *
		 * 3,1
		 * 3,9
		 *
		 * 1,3
		 * 9,3
		 *
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

	private ArrayList<Integer> inputToIndexes(String userInput) {

		String[] inputParts = userInput.split(" ");
		ArrayList<Integer> indexes = new ArrayList<>();

		/* The ASCII character code (int representation) for 'A' is 65
		 * The first index of an array is 0.
		 * Because of this, subtracting 65 from the int representation will result in the correct index.
		 */
		int tempNum;
		String tempStr;

		tempNum = (int) inputParts[0].charAt(0) - 65;
		indexes.add(tempNum);

		tempStr = inputParts[0].substring(1);
		tempNum = Integer.parseInt(tempStr) - 1;
		indexes.add(tempNum);

		tempNum = (int) inputParts[1].charAt(0) - 65;
		indexes.add(tempNum);

		tempStr = inputParts[1].substring(1);
		tempNum = Integer.parseInt(tempStr) - 1;
		indexes.add(tempNum);

		return indexes;
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
