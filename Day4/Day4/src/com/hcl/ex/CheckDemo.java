package  com.hcl.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 * Class CliMain provides the command line interface to the ChkDemo.
 * application.
 */

public class CheckDemo {
  /**
   * The main entry point.
   * @param args the list of arguments.
   * @throws FileNotFoundException throw FileNotFoundException.
   */
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream f1 = new FileInputStream("c:/hello.txt");
  }
}
