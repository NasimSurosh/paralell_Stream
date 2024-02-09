package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringChallenge {
  private static List<Integer> sequentialFilterExample(List<Integer> numbers) {
    return numbers
        .stream()
        .filter(number -> number %2 !=0)
        .collect(Collectors.toList());
  }

  private static List<Integer> parallelFilterExample(List<Integer> numbers) {
    return numbers
        .parallelStream()
        .filter(number -> number % 2 != 0)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>();
    
    for (int i = 0; i < 50; i++) {
      numbers.add(i);
    }

    long startNumber = System.currentTimeMillis();
    List<Integer> result = sequentialFilterExample(numbers);
    long endNumber = System.currentTimeMillis();
    System.out.println("Sequential execution time: " + (endNumber-startNumber) + " ms");
    result.forEach(System.out::println);

    long startNumber1 = System.currentTimeMillis();
    List<Integer> result1 = parallelFilterExample(numbers);
    long endNumber1 = System.currentTimeMillis();
    System.out.println("Parallel execution time: " + (endNumber1-startNumber1) + " ms");
    result1.forEach(System.out::println);

  }

}
