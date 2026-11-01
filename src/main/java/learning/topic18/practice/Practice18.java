package learning.topic18.practice;


import java.util.Arrays;

public class Practice18 {
    void main() {
        /*
         * Тема 18: массивы.
         * Индексы начинаются с 0, length хранит количество элементов.
         */
        int[] statusCodes = {200, 404, 500};
        statusCodes[1] = 201;

        IO.println(statusCodes[0]);
        IO.println(statusCodes[2]);
        IO.println(statusCodes.length);

        for(int i = 0; i < statusCodes.length; i++) {
            IO.println(statusCodes[i]);
        }

        int[] first = {1, 2, 3};
        int[] second = first;
        second[0] = 9;
        IO.println(first[0]);

        int[] numbers = {5, 1, 4, 2};
        Arrays.sort(numbers);
        IO.println(Arrays.toString(numbers));

        String[][] tests = {
                {"Login", "Logout"},
                {"Checkout"}
        };
        for(int i = 0; i < tests.length; i++) {
            for(int j = 0; j < tests[i].length; j++) {
                IO.println(tests[i][j]);
            }
        }
    }
}
