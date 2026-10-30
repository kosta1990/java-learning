package learning.topic12.practice;

/*
 * Тема 12: условия if/else.
 * Проверяем код ответа и выбираем сообщение о результате теста.
 */

public class Practice12 {
    void main(String[] args) {
        int statusCode = 404;
        if (statusCode == 200) {
            IO.println("Test passed");
        } else if (statusCode == 404) {
            IO.println("Page not found");
        } else {
            IO.println("Unexpected status");
        }
        boolean serverAvailable = true;
        boolean credentialsValid = false;
        if (serverAvailable) {
            if (credentialsValid) {
                IO.println("Login successful");
            } else {
                IO.println("Invalid credentials");
            }
        } else {
            IO.println("Server unavailable");
        }
        String expectedText = "Success";
        String actualText = "Error";
        if(expectedText.equals(actualText)){
            IO.println("Текст совпадает");
        } else {
            IO.println("Текст не совпадает");
        }
        String message = expectedText.equals(actualText) ? "Text matches" : "Text mismatch";
        IO.println(message);
    }
}

