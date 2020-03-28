import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class RunningTimeTest {
    private static int[] arr1;
    private static int[] arr2;
    private static final int SIZE = 300;

    @BeforeAll
    public static void initialize() {
        Random random = new Random();
        arr1 = new int[SIZE];
        arr2 = new int[SIZE];
        for (int i = 0; i < arr1.length; i++) {
            int temp = random.nextInt(101);
            arr1[i] = temp;
            arr2[i] = temp;
        }
    }

    @Test
    public void heapsortTest() {
        Heapsort.heapsort(arr1);
    }

    @Test
    public void insertionSortTest() {
        InsertionSort.insertionSort(arr2);
    }
}
