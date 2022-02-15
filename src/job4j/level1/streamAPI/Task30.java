package job4j.level1.streamAPI;

import java.util.Arrays;

/**
 * Ваша задача дописать методы. Для получения стрима нужно использовать Arrays.stream()
 */
public class Task30 {
    private int[] data;

    public Task30(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data)
                .max()
                .getAsInt();
    }

    public long min() {
        return Arrays.stream(data)
                .min()
                .getAsInt();
    }

    public double avg() {
        return Arrays.stream(data)
                .average()
                .getAsDouble();
    }

    public long sum() {
        return Arrays.stream(data)
                .sum();
    }
}
