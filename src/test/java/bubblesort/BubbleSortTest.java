package bubblesort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert. *;

public class BubbleSortTest {
    @Test
    public void isShouldSortTheListOfNumbers(){
        List<Integer> elements = Arrays.asList(10,5,6,7,15,30);
        List<Integer> expected = Arrays.asList(5,6,7,10,15,30);
        assertEquals(expected, BubbleSort.sort(elements));
    }
    @Test
    public void itShouldSortTheListOfString(){
        List<String> elements = Arrays.asList("a","d","k","b");
        List<String> expected = Arrays.asList("a","b","d","k");
        assertEquals(expected, BubbleSort.sort(elements));
    }
    @Test
    public void itShouldSortTheListOfDouble(){
        List<Double> elements = Arrays.asList(2.2,6.2,8.2,3.2,5.2,4.2);
        List<Double> expected = Arrays.asList(2.2,3.2,4.2,5.2,6.2,8.2);
        assertEquals(expected, BubbleSort.sort(elements));
    }
}
