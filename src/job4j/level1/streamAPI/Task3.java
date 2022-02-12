package job4j.level1.streamAPI;

import java.util.List;

/**
 * Ваша задача найти произведение чисел, используя данный метод. Размер списка всегда больше 0
 */
public class Task3 {
    public static Integer reduce(List<Integer> list) {
        return list.stream()
                .reduce((value1, value2) -> value1 * value2)
                .get();
    }
}
