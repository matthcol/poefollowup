package poe.model.play;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayCollectionString {

    @Test
    void playWithList1() {
        List<String> animals = new ArrayList<>();
        System.out.println(animals.size());
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
        System.out.println(animals.size());
        for (String animal: animals) {
            System.out.println("\t- " + animal);
        }
        String animal = animals.get(0);
        System.out.println(animal);
    }

    @Test
    void playWithList2() {
        List<String> animals = new ArrayList<>();
        Collections.addAll(animals, "Cat", "Dog", "Giraffe", "Snake");
        System.out.println(animals);
    }

    @Test
    void playWithList3() {
        // since Java 11
        List<String> animals = List.of("Mouse", "Cat", "Dog", "Giraffe", "Snake");
        // This list is immutable.
        // Following statement throws UnsupportedOperationException
        // animals.add("Lion");
        System.out.println(animals);
        System.out.println(animals.getClass());
        // loops: statements
        for (String animal: animals) {
            System.out.println("\t- " + animal.toUpperCase());
        }
        for (int i = 0; i < animals.size(); i++) {
            String animal = animals.get(i);
            System.out.println("\t* " + animal.toLowerCase());
        }
        // loops: functional
        // 1. .forEach(f)
        animals.forEach(a -> System.out.println("\t~ " + a));
        // 2. .reduce, .map, .filter
        List<Integer> countLetters = animals.stream()
                .map(a -> a.length())
                .toList(); // Java 17
        System.out.println(countLetters);
        // 3. other pipeline
        List<Integer> countLetters2 = animals.stream()
                .filter(a -> a.endsWith("e"))
                .map(String::length)
                .toList();
        System.out.println(countLetters2);
        // 4. pipeline with reduce
        int totalCountLetters = animals.stream()
                .filter(a -> a.endsWith("e"))
                .mapToInt(String::length)
                .sum();
        System.out.println(totalCountLetters);
    }
}














