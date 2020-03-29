import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class InputOutputTest {
    private final int SIZE = 10;
    private final int MAX_NUMBER = 101;
    private int[] arr1 = new int[SIZE];
    private Random random = new Random();

    @BeforeEach
    public void initialize() {
        for (int i = 0; i < arr1.length; i++) {
            int temp = random.nextInt(MAX_NUMBER);
            arr1[i] = temp;
        }
    }

    @Test
    public void insertionSortInputOutputTest() {
        System.out.println("\t\t\t==InsertionSort==" + "\nInput: " + Arrays.toString(arr1));
        InsertionSort.insertionSort(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));
    }

    @Test
    public void heapsortInputOutputTest() {
        System.out.println("\t\t\t==Heapsort==" + "\nInput: " + Arrays.toString(arr1));
        Heapsort.heapsort(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));
    }

    @Test
    public void heapsortDecrementInputOutputTest() {
        System.out.println("\t\t\t==Heapsort Decrement==" + "\nInput: " + Arrays.toString(arr1));
        HeapsortDecrement.heapsort(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));
    }
}
