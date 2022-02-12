package job4j.level1.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Ваша задача дописать метод, чтобы он умножал элементы списка
 */
public class Task2 {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> {
            int prod = 1;
            for (Integer n : ns) {
                prod *= n;
            }
            return prod;
        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
