package job4j.level1.lambda;

import java.util.List;
import java.util.Optional;

/**
 * Ваша задача написать метод поиска пользователя по логину. Если ничего не найдено,
 * то нужно вернуть исключение
 */
public class Task17 {
    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException { }

    public static User orElseThrow(List<User> list, String login) {
        return search(list, login).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User userLog : list) {
            if (login.equals(userLog.getLogin())) {
                return Optional.of(userLog);
            }
        }
        return user;
    }
}
