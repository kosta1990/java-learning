package learning.topic18.homework;

import java.util.Arrays;

public class ArrayPrinter {
    void showArray(String[][] values) {

        IO.print("{");
        // Вывод массива с фигурными скобками и запятыми
        for(int i = 0; i < values.length; i++) {
            if (i > 0) {
                IO.print(", ");
            }
            IO.print("{");
            for(int j = 0; j < values[i].length; j++) {
                if(j > 0){
                    IO.print(", ");
                }
                IO.print(values[i][j]);
            }
            IO.print("}");
        }
        IO.println("}");
    }

    void main() {
        String[][] values = {
                {"Login", "Logout"},
                {"Checkout"}
        };
        showArray(values);
    }
}
