package job4j.level1.lambda;

import java.util.function.Function;

/**
 * дописать лямбда выражение, которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
 */
public class Task4 {

    public static double calculate(double x) {
        Function<Double, Double> function = value -> value * value;
        return function.apply(x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
