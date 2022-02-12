package job4j.level1.streamAPI;

import java.util.List;

/**
 *
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(collect(List.of(1, 2)));
    }
    public static Integer collect(List<Integer> list) {
        return list.stream()
                .reduce(5, (val1, val2) -> val1 * val2);
    }
}
