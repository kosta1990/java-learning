package learning.topic18.homework;

import java.util.Arrays;

public class ArraySorter {
    int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
    void main(){
        int [] arr = {4, 1, 6, -3, 7};
        IO.println(Arrays.toString(sort(arr)));

        int[] arr1 = {3, -1, 3, 0};
        IO.println(Arrays.toString(sort(arr1)));
    }
}
