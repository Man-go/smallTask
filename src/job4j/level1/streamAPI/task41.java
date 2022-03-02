package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  Ваша задача отфильтровать список строк по следующему признаку.
 *  Строка должна начинаться на "A" и заканчиваться на ".java"
 */
public class task41 {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(value -> value.charAt(0) == 'A')
                .filter(value -> value.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
