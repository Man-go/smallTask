package job4j.level1.lambda;

import java.util.function.Supplier;

/**
 * Ваша задача вернуть Supplier, который создает пустую строку через new
 */
public class Task11 {
    public static Supplier<String> supplier() {
        return String::new;
    }
}
