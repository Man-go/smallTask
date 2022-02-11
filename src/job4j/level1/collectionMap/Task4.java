package job4j.level1.collectionMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Метод принимает строку, которая является названием статьи, а также коллекцию Set в которой
 * содержатся слова, которые не должны содержаться в названиях статей, чтобы мы могли
 * сконцентрироваться на материале изучения. Метод должен вернуть:
 * 1. Если в строке нет ни одного слова из коллекции Set, то метод должен вернуть строку:
 * Вы сделали правильный выбор!
 * 2. Если в строке имеется хоть одно из слов из коллекции Set, метод должен вернуть строку:
 * Выберите другую статью...
 */
public class Task4 {
    public static String checkName(String s, Set<String> words) {
        Set<String> wordsFromArticle = new HashSet<>(Arrays.asList(s.split(",?\\s+")));
        for (String value : wordsFromArticle) {
            if (words.contains(value)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
