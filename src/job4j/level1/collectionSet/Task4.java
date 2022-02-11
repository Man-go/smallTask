package job4j.level1.collectionSet;

import java.util.Map;

/**
 * метод принимает два отображения, которые имеют одинаковый размер:
 * 1. Ключ - тип Integer, значение - тип String. При этом значение - это Имя,
 * ключ - возрастающая последовательность, начиная с 1
 * 2. Ключ - тип Integer, значение - тип String. При этом значение - это Фамилия,
 * ключ - возрастающая последовательность, начиная с 1
 * Необходимо пройтись по первому отображению и к значению имени добавить значение фамилии,
 * чтобы на выходе получилось отображение - ключ(число) - значение(строка - имя + фамилия).
 */
public class Task4 {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Integer integer : name.keySet()) {
            name.computeIfPresent(integer, (key, value) -> value + " " + surname.get(integer));
        }
        return name;
    }
}
