package pl.com.algoritm.sort;

/**
 * @author Capgemini.
 */
public class BubbleSort {

  public static void main(String[] args) {

    int[] table = {2, 1, 3, 0, 4, 6, 5, 7, 8};

    bubbleSort(table);

    printArray(table);

  }

  /* Prints the array */
  private static void printArray(int arr[]) {

    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  private static void bubbleSort(int arr[]) {

    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {

      for (int j = 0; j < n - i - 1; j++) {
        
        if (arr[j] > arr[j + 1]) {
          // swap arr[j+1] and arr[i]
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

}