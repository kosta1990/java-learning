package learning.topic13.practice;

public class Practice13 {
    void printStatus(int statusCode) {
        // Выбор сообщения через switch
        switch (statusCode) {
            case 200 -> IO.println("OK");
            case 404 -> IO.println("Not found");
            case 500 -> IO.println("Server error");
            default -> IO.println("Unknown status");
        }
    }
    void main() {
        printStatus(200);
        printStatus(404);
        printStatus(500);
        printStatus(403);
    }
}
