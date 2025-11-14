package dwolf.streams.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamAndCollectorExample {
	record Car(String type, String make, String model, Integer engineCapacity) {}

	public static void main(String[] args) {
		List<Car> cars = List.of(
			new Car("sedan", "BMW", "530", 1998),
			new Car("sedan", "Audi", "A5", 1998),
			new Car("sedan", "Mercedes", "E-Class", 2500),
			new Car("hatchback", "Skoda", "Octavia", 1600),
			new Car("hatchback", "Toyota", "TypeR", 1450)
			);

		List<Car> sedanCars = cars.stream().filter(car -> car.type.equals("sedan")).toList();
		List<String> carMakeList = cars.stream().map(car -> car.make).toList();

		// Audi, A5, Mercedes, E-Class
								// make cars a stream
		List<List<String>> carMakeModelList = cars.stream()
			// for all car objects in the stream, do the operation:
			// make a new List containing the make and model of each iterated car object
			.map(car -> List.of(car.make, car.model)).toList();

		List<String> carMakeModelFlatList = cars.stream()
			// FlatMap irons out the stream of two elements and puts them into the resulting list
			.flatMap(car -> Stream.of(car.make, car.model)).toList();

	/* ########### Lazy Execution######################### */
/* The filtering operation is only executed if a terminal aka. final operation is made with the stream (after filter), which returns a non-stream object */
		Stream<Integer> integerStream = Stream.of(10, 11, 12, 13, 14);

		Stream<Integer> filteredIntegerStream = integerStream.filter(i -> {
			System.out.println("Filtering integer");
			return i % 2 == 0;
		});

		System.out.println("Count = " + filteredIntegerStream.count());

		/* #################################### */

		// For true key, we want to have all "sedan" types, and the "hatchback" types for false keys
		Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(
			Collectors.partitioningBy(car -> car.type.equals("sedan"))
		);

		System.out.println(partitionedCars);
	}
}
