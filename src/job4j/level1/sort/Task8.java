package job4j.level1.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * отсортировать массив строк в убывающем порядке и вернуть его. Среди строк нет null элементов.
 */
public class Task8 {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
