package job4j.level1.collectionSet;

import java.util.*;

/**
 * В данном задании необходимо реализовать словарь. Метод принимает массив строк.
 * Необходимо перебрать массив и добавить строки в карту таким образом, чтобы ключом
 * был первый символ строки, а значением - список строк, которые начинаются на первый символ строки.
 */
public class Task11 {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            String key = "" + s.charAt(0);
            if (rsl.containsKey(key)) {
                rsl.get(key).add(s);
            } else {
                rsl.putIfAbsent(key, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return rsl;
    }
}
