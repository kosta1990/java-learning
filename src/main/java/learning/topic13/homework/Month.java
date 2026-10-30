package learning.topic13.homework;

public class Month {
    void printDays(int monthNumber) {
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> IO.println("31 days");
            case 4, 6, 9, 11 -> IO.println("30 days");
            case 2 -> IO.println("28 days");
            default -> IO.println("Unknown month");
        }
    }
    void main(){
        printDays(1);
        printDays(2);
        printDays(4);
        printDays(0);
        printDays(13);
    }
}
