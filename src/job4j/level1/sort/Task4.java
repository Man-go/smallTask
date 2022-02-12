package job4j.level1.sort;

import java.util.Comparator;

/**
 *  получить null-frendly компаратор для строки.
 */
public class Task4 {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }
}
