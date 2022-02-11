package job4j.level1.collectionSet;

import java.util.*;

/**
 * Метод принимает строку, которая может содержать несколько пробелов, однако в ней
 * отсутствуют знаки препинания.
 * Необходимо реализовать метод, который вернет символ в строке, который употребляется
 * наибольшее количество раз. Если окажется что таких символов несколько - необходимо
 * вернуть первый из символов.
 */
public class Task7 {
    public static char getMaxCount(String str) {
        String loverCase = str.toLowerCase();
        loverCase = loverCase.replaceAll("\\s+", "");
        Map<String, Integer> letters = new TreeMap<>();
        List<String> lettersArray = Arrays.asList(loverCase.split(""));

        for (String s : lettersArray) {
            if (letters.containsKey(s)) {
                letters.computeIfPresent(s, (key, value) -> value + 1);
            } else {
                letters.putIfAbsent(s, 1);
            }
        }

        int maxValue = Collections.max(letters.values());
        for (String s : letters.keySet()) {
            if (letters.get(s) == maxValue) {
                return s.charAt(0);
            }
        }
    return ' ';
    }
}
