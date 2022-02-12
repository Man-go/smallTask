package job4j.level1.lambda;

import java.util.function.Consumer;

/**
 * Ваша задача совместить два Consumer, первый выводит строку через System.out.print,
 * а второй приписывает переход на новую строку через System.out.println
 */
public class Task7 {
    public static Consumer<String> consumer(String input) {
         Consumer<String> print = System.out::print;
         Consumer<String> ln = value -> System.out.println();
         return print.andThen(ln);
    }
}
