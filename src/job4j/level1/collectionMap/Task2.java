package job4j.level1.collectionMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * заполнить коллекцию строками от one до five, так,
 * чтобы в цикле печатались строки пока они есть, при этом на каждой итерации выводилось сообщение,
 * что значение существует в наборе.
 */
public class Task2 {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", iterator.hasNext()));
            System.out.println(iterator.next());
        }
    }
}
