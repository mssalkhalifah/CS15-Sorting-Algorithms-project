import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class HeapsortTest {
    @Test
    public void test() {
        int[] arr = new int[500];
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(101);
            }
            Heapsort.heapsort(arr);
            Assertions.assertTrue(InsertionSortTest.isSortedInc(arr));
        }
    }
}
