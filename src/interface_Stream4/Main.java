package interface_Stream4;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
   
    System.out.println("Normal stream");
    IntStream ordered = IntStream.rangeClosed(1, 10);  
    ordered.forEach(System.out::println);
    
    System.out.println("Parallel stream");
    IntStream unOrdered = IntStream.rangeClosed(1, 10); 
    unOrdered.parallel().forEach(System.out::println);
    
    
  }

}
