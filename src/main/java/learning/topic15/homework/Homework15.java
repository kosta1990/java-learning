package learning.topic15.homework;

/*
 * Тема 15: вложенные while и do-while.
 * Часы и секунды перебираются через while, минуты — через do-while.
 * break переводит к следующей минуте, return завершает метод.
 */

public class Homework15 {
    static void printTime() {
        int hour = 0;
        while (hour <= 6) {
            int minute = 0;
            do {
                if (hour > 1 && minute % 10 == 0) {
                    return;
                }
                int second = 0;
                while (second <= 59) {
                    if (second * hour > minute) {
                        break;
                    }
                    IO.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            }
            while (minute <= 59);
            hour++;
        }
    }

    void main() {
        printTime();
    }
}
