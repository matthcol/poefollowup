package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestPoe {

    @Test
    void testAllArgsConstructor(){
        String title = "Java Fullstack";
        LocalDate beginDate = LocalDate.of(2022, 10, 24);
        LocalDate endDate = LocalDate.of(2023, 1, 27);
        PoeType poeType = PoeType.POEI;
        List<Trainee>  trainees = new ArrayList<>();
        Poe poe = new Poe(title, beginDate, endDate, poeType, trainees);
        // TODO: assert all
        assertEquals(title, poe.getTitle(), "title");
        assertEquals(beginDate, poe.getBeginDate(), "begin date");
        assertEquals(endDate, poe.getEndDate(), "end date");
        assertEquals(poeType, poe.getPoeType(), "poe type");
        assertSame(trainees, poe.getTrainees(), "trainees");
    }

    @Test
    void testDefaultConstructor(){
        Poe poe = new Poe();
        assertNull(poe.getTitle());
        assertNull(poe.getBeginDate());
        assertNull(poe.getEndDate());
        assertNull(poe.getPoeType());
        assertTrue(poe.getTrainees().isEmpty(), "trainees is an empty collection");
    }

    @Test
    void testAddTrainee(){
        // given
        Poe poe = Poe.builder()
                .title("Java Fullstack")
                .beginDate(LocalDate.of(2022, 10, 24))
                .endDate(LocalDate.of(2023, 1, 27))
                .poeType(PoeType.POEI)
                .build();
        Trainee trainee = Trainee.builder()
                .firstname("Wesh")
                .build();
        // when
        poe.addTrainee(trainee);
        // then: trainee is in poe trainees
        assertTrue(poe.getTrainees().contains(trainee),
                "trainee " + trainee.getFirstname() + " is in poe trainees");
    }

    @Test
    void testAddTraineesCollection(){
        // given
        Poe poe = Poe.builder()
                .title("Java Fullstack")
                .beginDate(LocalDate.of(2022, 10, 24))
                .endDate(LocalDate.of(2023, 1, 27))
                .poeType(PoeType.POEI)
                .build();
        Trainee trainee1 = Trainee.builder()
                .firstname("Marcel")
                .build();
        Trainee trainee2 = Trainee.builder()
                .firstname("Michel")
                .build();
        Set<Trainee> trainees = Set.of(trainee1, trainee2);
        // when
        poe.addTrainees(trainees);
        // then
        assertAll(trainees.stream()
                .map(trainee -> () -> assertTrue(
                        poe.getTrainees().contains(trainee),
                        "trainee " + trainee.getFirstname() + " is in poe trainees"))
        );
    }

    @Test
    void testAddTraineesVarArgs(){
        // given
        Poe poe = Poe.builder()
                .title("Java Fullstack")
                .beginDate(LocalDate.of(2022, 10, 24))
                .endDate(LocalDate.of(2023, 1, 27))
                .poeType(PoeType.POEI)
                .build();
        Trainee trainee1 = Trainee.builder()
                .firstname("Marcel")
                .build();
        Trainee trainee2 = Trainee.builder()
                .firstname("Michel")
                .build();
        // when
        poe.addTrainees(trainee1, trainee2);
        // then
        assertAll(Stream.of(trainee1, trainee2)
                .map(trainee -> () -> assertTrue(
                        poe.getTrainees().contains(trainee),
                        "trainee " + trainee.getFirstname() + " is in poe trainees"))
        );

    }













}