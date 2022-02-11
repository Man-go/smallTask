package job4j.level1.collectionSet;

import java.util.HashMap;
import java.util.Map;

/**
 * Метод принимает массив строк, в котором строки могут повторяться.
 * Необходимо перебрать массив строк и сложить их в карту.
 * При этом должны выполниться следующие условия:
 * 1. Ключом является строка.
 * 2. Значением будет булево переменная.
 * 3. Если строка встречается в массиве 2 и более раз, то булево значение должно быть true.
 * В ином случае - должно принимать значение false.
 */
public class Task10 {

    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        for (String string : strings) {
            if (stringBooleanMap.containsKey(string)) {
                stringBooleanMap.computeIfPresent(string, (key, value) -> value = true);
            } else {
                stringBooleanMap.putIfAbsent(string, false);
            }
        }
        return stringBooleanMap;
    }
}
