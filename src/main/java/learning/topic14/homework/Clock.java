package learning.topic14.homework;

public class Clock {
    static void printTime() {
        for (int hour = 0; hour <= 6; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    return;
                }
                for (int second = 0; second <= 59; second++) {
                    if (second * hour > minute) {
                        break;
                    }
                    IO.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
    void main() {
        printTime();
    }
}
