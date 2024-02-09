package exercise2;


import java.util.List;
import java.util.stream.Collectors;

public class SimpleParallelStreamChallenge {
  private static List<Integer> parallelStringLenght(List<String> words){
    return words
        .parallelStream()
        .map(String -> String.length())
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    
    List<String> list = List.of("Java","Stream","Challenge","Python","C#");
    
    list.forEach(System.out::println);
    
    List<Integer> lengthOfWords = parallelStringLenght(list);
    lengthOfWords.forEach(System.out::println);

  }
}
