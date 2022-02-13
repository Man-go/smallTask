package job4j.level1.streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * ваша задача создать стрим из переданного массива
 */
public class Task11 {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
