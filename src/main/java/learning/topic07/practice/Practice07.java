package learning.topic07.practice;

public class Practice07 {
    void main() {
        TestConfig config = new TestConfig("https://example.com");
        config.retryCount = 3;
        //config.password = "test";
        config.printPassword();
    }
}
