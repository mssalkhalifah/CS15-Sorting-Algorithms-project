import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class InsertionSortTest {
    @Test
    public void test() {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(101);
            }
            arr = InsertionSort.insertionSort(arr);
            Assert.assertEquals(isSortedInc(arr), true);
        }
    }

    private static boolean isSortedInc(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (number > arr[i])
                return false;
            number = arr[i];
        }
        return true;
    }
}
