package job4j.level1.collectionMap;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Метод принимает список пользователей, при этом много пользователей могут иметь одинаковое имя.
 * Метод должен определить количество уникальных имен, которые имеют пользователи.
 */
public class Task1 {
    public static int collectUniqueName(List<User> users) {
        Set<User> uniqueNames = new HashSet<>(users);
        return uniqueNames.size();
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
