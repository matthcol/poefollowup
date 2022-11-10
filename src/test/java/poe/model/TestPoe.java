package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

}