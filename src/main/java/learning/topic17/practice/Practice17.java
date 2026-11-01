package learning.topic17.practice;

public class Practice17 {
    void main() {
        /*
         * Тема 17: StringBuilder.
         * append изменяет содержимое существующего объекта.
         */
        StringBuilder report = new StringBuilder("Test");
        report.append(" passed");
        IO.println(report);

        StringBuilder sameReport = report;
        sameReport.append("!");
        IO.println(report);

        sameReport.insert(0, "Login ");
        IO.println(sameReport);
        sameReport.delete(6, 11);
        IO.println(sameReport);
    }
}
