package job4j.level1.collectionSet;

import java.util.*;

/**
 * Метод принимает список объектов Info. При этом эти объекты содержат два поля:
 * 1. city - название города, где производились наблюдения;
 * 2. rainfall - количество осадков, которые выпали в этом городе за период наблюдения.
 * Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info,
 * в котором будет указано название города наблюдения и общее количество
 * осадков за период наблюдения.
 */
public class Task13 {

    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> result = new HashMap<>();

        for (Info info : list) {
            String key = info.getCity();
            if (!result.containsKey(key)) {
                result.putIfAbsent(key, info.getRainfall());
            } else {
                result.put(key, result.get(key) + info.getRainfall());
            }
        }
        List<Info> listResult = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : result.entrySet()) {
            listResult.add(new Info(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
        }
        return listResult;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
