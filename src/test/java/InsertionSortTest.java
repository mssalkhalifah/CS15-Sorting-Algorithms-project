import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class InsertionSortTest {
    @Test
    public void test() {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(101);
            }
            InsertionSort.insertionSort(arr);
            Assert.assertTrue(isSortedInc(arr));
        }
    }

    public static boolean isSortedInc(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (number > arr[i])
                return false;
            number = arr[i];
        }
        return true;
    }
}
