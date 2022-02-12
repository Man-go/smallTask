package job4j.level1.lambda;

import java.util.function.Predicate;

/**
 * Вам нужно дописать лямбда выражение, которое проверяет, что число положительное
 */
public class Task1 {
    public static boolean check(int num) {
        return num > 0;
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
