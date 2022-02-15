package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача собрать строки списка в текст и добавить префикс "Prefix",
 * и суффикc "Suffix"(т.е. нужно использовать перегруженный вариант joining()).
 * Разделителем должен быть System.lineSeparator()
 */
public class Task23 {
    public static String join(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
