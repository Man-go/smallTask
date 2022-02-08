package job4j.level1.collectionList;

import java.util.ArrayList;
import java.util.List;

/**
 * метод принимает два параметра - список и элемент, который предполагается,
 * что содержится в этом списке. Необходимо реализовать метод, чтобы он возвращал
 * результаты следующим образом:
 *
 * 1. Элемента нет в списке - возвращает пустой список.
 * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
 * 3. Элемент встречается более одного - возвращается список, начиная с первого вхождения
 * элемента и заканчивая предшествующим последнему вхождению элемента в исходной коллекции.
 */
public class Task9 {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
