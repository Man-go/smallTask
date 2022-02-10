package job4j.level1.collectionList;

import java.util.List;

/**
 * Необходимо реализовать метод, который определит является ли список чисел
 * арифметической прогрессией. Если является - то метод должен вернуть сумму
 * всех элементов, иначе - вернуть 0.
 */
public class Task14 {
    public static int checkData(List<Integer> data) {
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) != (data.get(i - 1) + data.get(i + 1)) / 2) {
                return 0;
            }
        }
    return (data.get(0) + data.get(data.size() - 1)) * data.size() / 2;
    }
}
