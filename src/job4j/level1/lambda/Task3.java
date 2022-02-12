package job4j.level1.lambda;

import java.util.function.Predicate;

/**
 * вам нужно дописать лямбда выражение, которое проверяет, что число четное и положительное
 */
public class Task3 {
    public static boolean check(int num) {
        Predicate<Integer> predicate = value -> value % 2 == 0 && value > 0;
        return predicate.test(num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
