package job4j.level1.streamAPI;

import java.util.stream.Stream;

/**
 * Ваша задача вывести элементы стрима в консоль через System.out.println()
 */
public class Task26 {
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
