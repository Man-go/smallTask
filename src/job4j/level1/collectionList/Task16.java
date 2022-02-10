package job4j.level1.collectionList;

import java.util.*;

/**
 * Вам необходимо реализовать метод, который принимает строку, которое является одним словом,
 * без знаков препинания цифр и пробелов. Метод должен вернуть новую строку,
 * в которой все символы исходной строки будут расставлены в алфавитном порядке.
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println(reformat("javascript"));
    }
    public static String reformat(String s) {
        List<String> characters = Arrays.asList(s.split(""));
        characters.sort(String::compareTo);
        StringBuilder stringBuilder = new StringBuilder();

        for (String character : characters) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }
}
