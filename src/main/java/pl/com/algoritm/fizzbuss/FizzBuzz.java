package pl.com.algoritm.fizzbuss;

/**
 * @author Capgemini.
 */
public class FizzBuzz {

  public static void main(String[] args) {

    fizzBuzzAppending();

  }

  private static void fizzBuzz() {


    for (int i = 1; i <= 100; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else {
        if (i % 3 == 0) {
          System.out.println("Fizz");
        } else {
          if (i % 5 == 0) {
            System.out.println("Buzz");
          } else {
            System.out.println(i);
          }
        }
      }
    }
  }

  private static void fizzBuzzAppending() {

    StringBuilder builder = new StringBuilder();

    for (int i = 1; i <= 100; i++) {
      final int length = builder.length();
      if (i % 3 == 0) {
        builder.append("Fizz");
      }
      if (i % 5 == 0) {
        builder.append("Buzz");
      }
      if (length == builder.length()) {
        builder.append(i);
      }
      builder.append('\n');
    }
    System.out.println(builder);
  }

}