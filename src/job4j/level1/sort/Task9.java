package job4j.level1.sort;

import java.util.Comparator;
import java.util.List;

/**
 *  отсортировать список строк по убыванию. В списке могут быть null элементы,
 *  они должны оказаться в конце после сортировки.
 */
public class Task9 {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
