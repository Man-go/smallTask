package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список пользователей. Вам нужно оставить только пользователей,
 * у которых имя начинается с буквы "B", а возраст > 18.
 */
public class Task42 {

    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() > 18)
                .filter(user -> user.getName().charAt(0) == 'B')
                .collect(Collectors.toList());
    }
}
