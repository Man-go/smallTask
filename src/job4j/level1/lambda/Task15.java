package job4j.level1.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Ваша задача, написать метод поиск строки среди списка. В списке могут быть null элементы.
 */
public class Task15 {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String string : strings) {
            if (Objects.equals(string, value)) {
                return Optional.ofNullable(string);
            }
        }
    return Optional.empty();
    }
}
