package pl.com.algoritm.sort;

/**
 * @author Capgemini.
 */
public class QuickSortLamutoPartition {

  public int partition(int[] numbers, int start, int end) {

    int pivot = numbers[end];
    int x = start - 1;
    for (int i = start; i < end; i++) {
      if (numbers[i] < pivot) {
        x++;
        swap(numbers, x, i);
      }
    }
    swap(numbers, x + 1, end);
    return x + 1;
  }

  private void swap(int[] numbers, int x, int i) {

    int pom = numbers[i];
    numbers[i] = numbers[x];
    numbers[x] = pom;


  }

}