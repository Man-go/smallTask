package job4j.level1.lambda;

import java.util.function.Predicate;

/**
 * Вам нужно дописать лямбда выражение, которое проверяет, что число четное
 */
public class Task2 {
    public static boolean check(int num) {
        return num % 2 == 0;
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
