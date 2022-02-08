package job4j.level1.collectionList;

import java.util.List;

/**
 * необходимо реализовать метод, который вернет список строк, которые состоят из 5 и более символов.
 */
public class Task10 {
    public static List<String> sortList(List<String> list) {
        list.removeIf(value -> value.length() < 5);
        return list;
    }
}
