package job4j.level1.lambda;

import java.util.Optional;

/**
 *
 */
public class Task16 {
    public static Integer orElse(Optional<Integer> optional) {
        Integer value = -1;
        return optional.orElse(value);
//        Integer value = -1;
//        if (optional.isPresent()) {
//            value = optional.get();
//        }
//        return value;
    }
}
