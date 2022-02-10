package job4j.level1.collectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * сначала пройтись по списку в прямом порядке, а потом в обратном.
 */
public class Task12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("one", "two", "three"));
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Start iterate...");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Change direction iterate...");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println("Finish iterate...");
    }
}
