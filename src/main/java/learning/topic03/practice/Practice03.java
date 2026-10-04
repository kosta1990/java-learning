package learning.topic03.practice;

public class Practice03 {
    void main() {
        //task1
        int totalTests = 17;
        int groupSize = 5;
        int fullGroups = totalTests / groupSize;
        int remainingTests = totalTests % groupSize;
        IO.println("Full groups: " + fullGroups);
        IO.println("Remaining tests: " + remainingTests);

        //task2
        int passedTests = 15;
        int totalChecks = 17;
        boolean allPassed = passedTests == totalChecks;
        boolean hasFailures = passedTests < totalChecks;
        IO.println("All tests passed: " + allPassed);
        IO.println("Tests with failures: " + hasFailures);

        //task3
        boolean serverAvailable = true;
        boolean credentialsValid = false;
        boolean canLogin = serverAvailable && credentialsValid;
        boolean hasProblem = !serverAvailable || !credentialsValid;
        boolean cannotLogin = !canLogin;
        IO.println("Can login: " + canLogin);
        IO.println("Has problem: " + hasProblem);
        IO.println("Cannot login: " + cannotLogin);


        // task4
        int newTests = 20;
        newTests -= 5; //15
        newTests *= 2; //30
        newTests /= 3; //10
        IO.println(newTests);

        // task5
        int count = 5;
        IO.println(count++); //5 сначала выводим, потом увеличиваем - постфиксная форма
        IO.println(count); //6
        IO.println(++count); //7
    }
}
