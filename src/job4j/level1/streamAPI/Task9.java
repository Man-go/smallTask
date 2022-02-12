package job4j.level1.streamAPI;

import java.util.stream.Stream;

/**
 * обход начиная с 0, причем обходился бы только каждый второй элемент.
 */
public class Task9 {
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(i -> System.out.println(data[i]));
    }
}
