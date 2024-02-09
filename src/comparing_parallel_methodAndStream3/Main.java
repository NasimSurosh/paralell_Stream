package comparing_parallel_methodAndStream3;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    
    System.out.println("Normal streams");
    List<String> list = new ArrayList<>();
    
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");
    
    list.stream().forEach(System.out::println);
    
    System.out.println("Parallel streams");
    
    list.parallelStream().forEach(System.out::println);

  }

}
