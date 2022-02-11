package job4j.level1.collectionMap;

import java.util.*;

/**
 * Метод принимает строку(на английском языке). Необходимо реализовать его так,
 * чтобы метод определил является ли входящая строка панграммой. Строчные и прописные
 * буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkString("Jackdaws love my big sphinx of quartz"));
    }

    public static boolean checkString(String s) {
        String lowerCase = s.toLowerCase();
        Set<Character> letterOfString = new HashSet<>();
        for (int i = 0; i < lowerCase.length(); i++) {
            char nextChar = lowerCase.charAt(i);
            if (nextChar >= 'a' && nextChar <= 'z') {
                letterOfString.add(nextChar);
            }
        }
        System.out.println(letterOfString.size());
        return letterOfString.size() == 26;
    }
}
