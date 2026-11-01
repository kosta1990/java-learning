package learning.topic17.homework;

public class BuilderComparator {
    boolean areEqual(StringBuilder first, StringBuilder second) {
        // Сравнение содержимого
        if (first.length() != second.length()) {
            return false;
        }
        // Проверяем все символы.
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    void main() {
        StringBuilder s1 = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");
        IO.println(areEqual(s1, s2));

    }
}
