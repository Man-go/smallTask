package job4j.level1.collectionList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *необходимо реализовать метод, который добавляет элемент в
 * список и сообщает нам удалось это или нет, т.е. метод должен
 * вернуть булево значение.
 *
 */
public class Task2 {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);

        return check.add(str);
    }
}
