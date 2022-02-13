package job4j.level1.streamAPI;

import java.util.stream.IntStream;

/**
 * Ваша задача создать стрим с использованием метода rangeClosed()
 */
public class Task12 {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
