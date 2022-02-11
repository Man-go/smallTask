package job4j.level1.sort;

/**
 * задача написать два метода, которые сравнивают два числа, первый сравнивает в прямом
 * порядке, второй в обратном порядке.
 */
public class Task1 {

    public static int ascendingCompare(int first, int second) {
        return first - second;
    }

    public static int descendingCompare(int first, int second) {
        return second - first;
    }
}
