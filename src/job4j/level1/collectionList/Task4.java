package job4j.level1.collectionList;

import java.util.List;

/**
 * метод принимает список и элемент который мы ищем в списке. Необходимо определить,
 * является ли этот элемент уникальным в этом списке.
 */
public class Task4 {
    public static boolean checkList(List<String> list, String str) {
        int firstIndex = list.indexOf(str);
        int lastIndex = list.lastIndexOf(str);
        return firstIndex == lastIndex && firstIndex != -1;
    }
}
