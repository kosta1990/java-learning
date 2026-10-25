package learning.topic07.external;
import learning.topic07.practice.TestConfig; // Позволяет использовать короткое имя TestConfig

public class ExternalCheck {
    void main() {
        TestConfig config = new TestConfig("https://example.com"); //learning.topic07.practice.TestConfig config = new learning.topic07.practice.TestConfig(); можно вызвать по полному имени из другого класса
        //config.retryCount = 3;
    }
}
