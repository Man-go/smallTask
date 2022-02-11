package job4j.level1.collectionSet;

import java.util.*;

/**
 * Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
 * При реализации необходимо игнорировать пробелы во входной строке.
 * Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из строки,
 * а значением - список индексов, под которыми этот символ (если таких символов несколько)
 * входит в исходную строку. Важно: строчные и прописные символы считаются разными символами.
 */
public class Task12 {

    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> characterListMap = new HashMap<>();
        String stringNoSpaces = s.replaceAll("\\s+", "");
        for (int i = 0; i < stringNoSpaces.length(); i++) {
            Character charFromString = stringNoSpaces.charAt(i);
            if (!characterListMap.containsKey(charFromString)) {
                characterListMap.putIfAbsent(charFromString, new ArrayList<>(Arrays.asList(i)));
            } else {
                characterListMap.get(charFromString).add(i);
            }
        }
        return characterListMap;
    }
}
