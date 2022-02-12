package job4j.level1.lambda;

import java.util.List;
import java.util.Optional;

/**
 * Ваша задача написать метод поиска строки среди списка строк. Если значение найдено,
 * то нужно вернуть Optional из этого значения, в противном случае вернуть пустой Optional.
 */
public class Task12 {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String string : strings) {
            if (value.equals(string)) {
                return Optional.of(string);
            }
        }
        return Optional.empty();
    }
}
