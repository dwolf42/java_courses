package dwolf.streams.examples;

import java.util.List;

class Stream_FunctionalDataProcessing_LoopVsStream {
	public static void main(String[] args) {
		// Task: Count numbers greater than 5
		List<Integer> numbers = List.of(1, 4, 7, 6, 2, 9, 7, 8);

		// Traditional approach
		long tradCount = 0;
		for (int number : numbers) {
			if (number > 5) {
				tradCount++;
			}
		}
		System.out.println("Traditional: " + tradCount);

		// Stream approach
		long streamCount = numbers.stream()
			// add a skip(4) to skip the first 4 numbers
			// reads the same as a for each loop:
			// for each number do number > 5 count
			.filter(number -> number > 5) // predicate lambda expression
			.count(); // 5

		System.out.println("Stream: " + streamCount);

	}

}
