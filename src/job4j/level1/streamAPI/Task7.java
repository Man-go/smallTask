package job4j.level1.streamAPI;

import java.util.stream.Stream;

/**
 * Ниже приведен код, создайте стрим из символов 'a', 'b', 'c'
 */
public class Task7 {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
