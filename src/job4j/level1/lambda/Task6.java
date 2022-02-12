package job4j.level1.lambda;

import java.util.function.Function;

/**
 * Ниже приведен код. Вам нужно дописать лямбда выражение, которое будет подставлять
 * переданное число в формулу
 * num * num + 2 * num + 1
 */
public class Task6 {
    public static double calculate(double x) {
        Function<Double, Double> function = value -> value * value + 2 * value + 1;
        return function.apply(x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
