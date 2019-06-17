package pl.com.algoritm.fibbonaci;

/**
 * @author Capgemini.
 */
public class Fibbonaci {

  public static void main(String[] args) {

    System.out.println(fibbonaci(6));
  }

  private static int fibbonaci(int i) {

    if (i <= 1) {
      return i;
    }

    return fibbonaci(i - 1) + fibbonaci(i - 2);

  }

}