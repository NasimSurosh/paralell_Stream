package exercise3;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelCuncurrentFilteringChallenge {
  private static List<String> filterAndCollectConcurrently(List<String> words, int lengthThereshold){
    return words
        .parallelStream()
        .filter(word -> word.length() == lengthThereshold)
        .collect(Collectors.toList());
  }
  public static void main(String[] args) {

    List<String> list = List.of("name","Katya","Car","Train","Airplan");
    System.out.println("Original list");
    list.forEach(System.out::println);
    
    List<String> newList = filterAndCollectConcurrently(list, 5);
    System.out.println("\nFiltered list");
    newList.forEach(System.out::println);

  }

}
