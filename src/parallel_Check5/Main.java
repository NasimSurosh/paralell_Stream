package parallel_Check5;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    
    IntStream stream1 = IntStream.rangeClosed(1, 8);
    
    if(stream1.isParallel()) {
      System.out.println("Stream is parallel.");
    }else {
      System.out.println("Stream is not parallel.");
    }
    
    stream1.forEach(System.out::println);
   
    IntStream stream2 = IntStream.rangeClosed(1, 8);
    IntStream stream2Parallel = stream2.parallel();
    
    if(stream2.isParallel()) {
      System.out.println("Stream is parallel.");
    }else {
      System.out.println("Stream is not parallel.");
    }
    stream2Parallel.forEach(System.out::println);
    

  }

}
