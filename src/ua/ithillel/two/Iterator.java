package ua.ithillel.two;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Iterator {
    private final List<Integer> sortedNumbers;
    private int index = 0;

    public Iterator(int[][] arr) {
        sortedNumbers = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .boxed()
                .collect(toList());
    }

    public boolean hasNext() {
        return index < sortedNumbers.size();
    }

    public int next() {
        return sortedNumbers.get(index++);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5},
                {1, 3, 7},
                {2, 2, 3, 6}
        };
        Iterator iterator = new Iterator(arr);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
