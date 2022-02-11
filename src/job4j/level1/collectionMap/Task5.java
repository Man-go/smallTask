package job4j.level1.collectionMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Выигрышной комбинацией для джекпота в казино считается такая, в которой все элементы одинаковые.
 * Метод принимает массив строк, который содержит последовательность
 * элементов игровой комбинации. Метод должен вернуть true - если комбинация является выигрышной.
 */
public class Task5 {
    public static boolean checkYourWin(String[] combination) {
        Set<String> winCombination = new HashSet<>(Arrays.asList(combination));
        return winCombination.size() == 1;
    }
}
