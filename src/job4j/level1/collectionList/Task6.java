package job4j.level1.collectionList;

import java.util.List;

/**
 * метод принимает в качестве параметров список и индекс элемента который
 * необходимо заменить. необходимо дописать метод так, чтобы сначала
 * удалялся последний элемент в списке, а потом этим элементом заменить
 * элемент по индексу, который пришел в параметрах метода
 */
public class Task6 {

    public static List<String> changePosition(List<String> list, int index) {
        if(index < list.size()) {
            list.set(index, list.remove(list.size() - 1));
        } else {
            list.remove(list.size() - 1);
        }
        return list;
    }
}
