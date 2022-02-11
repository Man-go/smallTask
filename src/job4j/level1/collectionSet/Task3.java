package job4j.level1.collectionSet;

import java.util.HashMap;
import java.util.Map;

/**
 * в консоль были выведены все значения отображения. При этом необходимо использовать
 * метод keySet() и get().
 */
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
