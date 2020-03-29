import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class HeapsortDecrementTest {
    private static int[] arr;
    private static final int SIZE = 100000000;

    @BeforeAll
    public static void initialize() {
        Random random = new Random();
        arr = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(1000000001);
            arr[i] = temp;
        }
    }

    @Test
    public void heapsortDecTest() {
        HeapsortDecrement.heapsort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] >= arr[i + 1]);
        }
    }
}
