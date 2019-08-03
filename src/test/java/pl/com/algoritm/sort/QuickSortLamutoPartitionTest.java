package pl.com.algoritm.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Capgemini.
 */
public class QuickSortLamutoPartitionTest {

  @Test
  public void testQuickSortLamutoPartition() {
    int[] numbersToSort = {8, 7, 6, 5, 1, 3, 2, 4};

    QuickSortLamutoPartition quickSortLamutoPartition = new QuickSortLamutoPartition();
    int partition = quickSortLamutoPartition.partition(numbersToSort, 0, 7);

    Assert.assertEquals(partition, 4);
  }

}