package learning.topic18.homework;

import java.util.Arrays;

public class ArraySorterTest {
    public static void main(String[] args) {
        ArraySorter sorter = new ArraySorter();
        assertSorted(sorter, new int[]{2, 9, 6, 3, 7}, new int[]{9, 7, 6, 3, 2});
        assertSorted(sorter, new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        assertSorted(sorter, new int[]{}, new int[]{});
        assertSorted(sorter, new int[]{42}, new int[]{42});
        assertSorted(sorter, new int[]{4, 2, 4, 1}, new int[]{4, 4, 2, 1});
        assertSorted(sorter, new int[]{-3, 5, -1, 0}, new int[]{5, 0, -1, -3});

        int[] numbers = {3, 1, 2};
        if (sorter.sort(numbers) != numbers) {
            throw new AssertionError("sort should return the same array instance");
        }
    }

    private static void assertSorted(ArraySorter sorter, int[] numbers, int[] expected) {
        int[] actual = sorter.sort(numbers);
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected " + Arrays.toString(expected)
                    + " but got " + Arrays.toString(actual));
        }
    }
}