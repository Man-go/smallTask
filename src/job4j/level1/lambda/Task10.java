package job4j.level1.lambda;

import java.util.function.Predicate;

/**
 * Ваша задача создать предикат Predicate, который проверяет, что строка пустая.
 */
public class Task10 {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
