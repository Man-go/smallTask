package job4j.level1.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * нужно создать стрим из переданного массива
 */
public class Task8 {
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
