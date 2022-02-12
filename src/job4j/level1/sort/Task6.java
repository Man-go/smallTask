package job4j.level1.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * написать компаратор, который будет упорядочивать пользователей сначала по возрастанию по имени,
 * а потом по убыванию по возрасту.
 */
public class Task6 {

    public static void main(String[] args) {
        User user1 = new User("C", 10);
        User user2 = new User("B", 20);
        User user3 = new User("A", 15);
        User user4 = new User("B", 11);
        User user5 = new User("A", 12);
        List<User> input = Arrays.asList(user1, user2, user3, user4, user5);
        input.sort(thenComparing());
        for (User user : input) {
            System.out.println(user.name + " " + user.getAge());
        }
    }

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

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        return Comparator.comparing(User::getName);
    }

    public static Comparator<User> descByAge() {
        return Comparator.comparing(User::getAge).reversed();
    }

}