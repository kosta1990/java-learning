package learning.topic07.practice;

public class TestConfig {
    public String baseUrl;
    int retryCount;
    private String password;
    public void printPassword() {
        IO.println(password);
    }
    public TestConfig (String url) {
        this.baseUrl = url;
    }
}
