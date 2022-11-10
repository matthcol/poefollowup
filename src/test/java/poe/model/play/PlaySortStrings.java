package poe.model.play;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlaySortStrings {

    @Test
    void compareStrings() {
        String animal1 = "dog";
        String animal2 = "cat";
        assertTrue(animal1.compareTo(animal2) > 0);
    }

    @Test
    void sortListStrings() {
        List<String> animals = new ArrayList<>();
        Collections.addAll(animals,
                "dog", "giraffe", "cat", "zebra", "snake", "mouse");
        Collections.sort(animals);
        System.out.println(animals);
    }

    @Test
    void sortListFrenchWords() {
        List<String> words = new ArrayList<>();
        Collections.addAll(words,
                "été", "étage", "étuve");
        // sort with french order
        Collections.sort(words);
        System.out.println(words);
        // expected : étage, été, étuve
    }

    @Test
    void sortListSpanishWords() {
        List<String> words = new ArrayList<>();
        Collections.addAll(words,
                "matador", "mano", "mañana");
        // sort with spanish order

        // expected: mano, mañana, matador
    }


}
