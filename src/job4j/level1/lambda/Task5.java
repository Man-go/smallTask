package job4j.level1.lambda;

import java.util.function.Function;

/**
 * Вам нужно дописать лямбда выражение, которое извлекает корень квадратный из числа
 */
public class Task5 {
    public static double calculate(double x) {
       Function<Double,Double> function = Math::sqrt;
       return function.apply(x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
