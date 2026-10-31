package learning.topic15.practice;

/*
 * Тема 15: while и do-while.
 * while проверяет условие перед выполнением тела цикла.
 */

public class Practice15 {

    int remainingTests = 5;

    void main() {
        while (remainingTests > 0) {
            System.out.println("Tests remaining: " + remainingTests);
            remainingTests--;
        }

        int attempt = 1;
        do{
            System.out.println("Attempt: " + attempt);
            attempt++;
        } while(attempt < 4);
    }
}
