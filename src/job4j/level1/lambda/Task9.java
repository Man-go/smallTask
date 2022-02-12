package job4j.level1.lambda;

import java.util.function.Function;

/**
 * ваша задача создать Function через ссылку на метод.
 * В качестве функции нужно использовать Math.sqrt()
 */
public class Task9 {
    public static Function<Double, Double>  apply() {
        return Math::sqrt;
    }
}
