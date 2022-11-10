package poe.model.play;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlaySortIntegers {

    @Test
    void compareIntegers() {
        int distance1 = 15;
        int distance2 = 4;
        assertFalse(distance1 < distance2);
    }

    @Test
    void sortIntegers() {
        List<Integer> distances = new ArrayList<>();
        Collections.addAll(distances, 15, 4, 101, 55, 2, 98);
        Collections.sort(distances);
        System.out.println(distances);
        distances.sort(Comparator.reverseOrder());
        System.out.println(distances);
    }


    @Test
    void navigableSetIntegers() {
        NavigableSet<Integer> distances = new TreeSet<>();
        Collections.addAll(distances, 15, 4, 101, 55, 2, 98);
        System.out.println(distances);
        distances.add(42);
        System.out.println(distances);
        NavigableSet<Integer> distances2 = new TreeSet<>(
                Comparator.reverseOrder());
        distances2.addAll(distances);
        System.out.println(distances2);
        distances2.add(42);
        System.out.println(distances2);
    }


}
