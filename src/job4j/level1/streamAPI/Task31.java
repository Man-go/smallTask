package job4j.level1.streamAPI;

import java.util.List;
import java.util.Optional;

/**
 * Ваша задача получить первый элемент стрима списка
 */
public class Task31 {
    public static Optional<Integer> first(List<Integer> list) {
        return list.stream()
                .findFirst();
    }
}
