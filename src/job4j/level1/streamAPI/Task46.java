package job4j.level1.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача собрать уникальные числа массива в список
 */
public class Task46 {

    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}
