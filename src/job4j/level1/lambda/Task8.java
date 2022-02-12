package job4j.level1.lambda;

import java.util.function.Consumer;

/**
 * Ваша задача написать два consumer первый обращается к нестатическому методу, а второй к статическому
 */
public class Task8 {
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = Task8::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
