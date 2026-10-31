package learning.topic14.practice;

/*
 * Тема 14: цикл for.
 * Повторяем действие для заданного диапазона значений.
 */

public class Practice14 {
    void main() {
        for(int i = 1; i <= 5; i++){
            if (i == 3){
                break;
            }
            IO.println("Running test " + i);
        }

        for(int run = 1; run <= 2; run++){
            for(int test = 1; test <= 3; test++){
                if (test == 2) {
                    break;
                }
                IO.println("Run " + run + ", test " + test);
            }
        }
    }
}
