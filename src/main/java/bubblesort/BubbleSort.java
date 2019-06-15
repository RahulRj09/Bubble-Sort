package bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    private static <T extends Comparable<T>> List<T> sort(List<T> elements) {
        List<T> copyElements = new ArrayList<>(elements);
        for (int i = 0; i < copyElements.size() - 1; i++) {
            for (int j = 0; j < copyElements.size() - i - 1; j++) {
                if (copyElements.get(j).compareTo(copyElements.get(j + 1)) > 0) {
                    SwapElement.swap(copyElements, j, j + 1);
                }
            }
        }
        return copyElements;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 7, 8, 45, 1);
        System.out.println(sort(numbers));
    }
}
