package job4j.level1.collectionMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Изограмма - это слово, которое не содержит повторяющихся букв,
 * т.е. все буквы в таком слове уникальные.
 * Метод должен вернуть булево значение - если слово является изограммой - то метод вернет true,
 * иначе - false.
 */
public class Task6 {
    public static boolean checkString(String s) {
        Set<String> letters = new HashSet<>(Arrays.asList(s.split("")));
        return s.length() == letters.size();
    }
}
