package job4j.level1.streamAPI;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Ваша задача получить список уникальных пользователей.
 */
public class Task47 {

    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static List<User> distinct(List<User> users) {
        return users.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
