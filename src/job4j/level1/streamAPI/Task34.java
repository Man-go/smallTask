package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список возрастов. Вам нужно создать список пользователей с такими возрастами
 */
public class Task34 {

    public static class User {

        private int age;

        public User(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream()
                .map(value -> new User(value))
                .collect(Collectors.toList());
    }
}
