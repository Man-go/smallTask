package job4j.level1.collectionList;

import java.util.List;

/**
 * 
 *  вам необходимо реализовать метод, который будет
 *  возвращать первую строку из коллекции строк, но прежде чем
 *  получить результат - необходимо проверить содержатся ли элементы в списке.
 *  Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции.
 *
 */
public class Task1 {

    public static String getElement(List<String> list) {
        return list.isEmpty() ? "" : list.get(0);
    }

}
