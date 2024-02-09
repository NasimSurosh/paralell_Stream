package parallel_method1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
  /* Sequential stream is executed in a single thread.
   * Parallel stream is executed by different threads at the same time.
   * Use Parallel stream only when you dont have to rely on an order.
   * 
   * Different ways to create parallel streams:
   *   1. Using the parallel method on a stream.
   *   2. Using the parallelStrseam() method on a collecction. 
   */

  public static void main(String[] args) throws IOException {
    
    File file = new File("names.txt");
    
    Stream<String> text = Files.lines(file.toPath());
    
    text.parallel().forEach(System.out::println);
    
    text.close();
    
  }

}
