package job4j.level1.lambda;

import java.util.Optional;

/**
 * 1. Написать метод indexOf(). Он ищет индекс по значению. Если индекс не найден,
 * должно вернуться Optional.empty(). Если найден, то Optional из этого индекса
 * 2. В методе get() нужно вызвать метод indexOf(). Если вернулся пустой Optinal,
 * то метод должен вернуть -1, в противном случае сам индекс
 */
public class Task13 {
    public static int get(int[] data, int el) {
        Optional<Integer> optional = indexOf(data, el);
        if (optional.isEmpty()) {
            return -1;
        }
        return optional.get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
