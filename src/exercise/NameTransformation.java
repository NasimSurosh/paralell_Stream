package exercise;

import java.util.List;
import java.util.stream.Collectors;

public class NameTransformation {
  
  private static List<String> sequentialStreamExample(List<String> names){
    return names
        .stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }
  private static List<String> parallelStreamExample(List<String> names){
    return names
        .parallelStream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    
    List<String> listOfNames = List.of("Alice","Bob","Charlie","Mahmood","Katya");
    
    long startTime = System.currentTimeMillis();
    List<String> result = sequentialStreamExample(listOfNames);
    long endTime = System.currentTimeMillis();
    System.out.println("Start time " + (endTime - startTime)+" ms");
    System.out.println("\nSequential stream");
    result.forEach(System.out::println);
    
    long startTime1 = System.currentTimeMillis();
    List<String> result1 = parallelStreamExample(listOfNames);
    long endTime1 = System.currentTimeMillis();
    System.out.println("Start time " + (endTime1 - startTime1 )+" ms");
    System.out.println("\nParallel stream");
    result1.forEach(System.out::println);
    

  }

}
