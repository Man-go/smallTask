package job4j.level1.sort;

import java.util.Comparator;

/**
 * задача получить null-frendly компаратор для строки.
 */
public class Task5 {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
