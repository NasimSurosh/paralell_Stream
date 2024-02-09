package parallel_Stream2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    
    File file = new File("names.txt");
    
    List<String> text = Files.readAllLines(file.toPath());
    
    // text.parallelStream().forEach(System.out::println);   (prints un order)
    
    text.forEach(System.out::println);
  }

}
