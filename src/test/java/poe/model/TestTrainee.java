package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrainee {


    /**
     * default constructor set all object attributes to null
     */
    @Test
    void testDefaultConstructor(){
        Trainee trainee = new Trainee();
        assertNull(trainee.getFirstname());
        assertNull(trainee.getLastname());
        assertNull(trainee.getBirthdate());
    }

    /**
     * all args constructor initialize all attributes
     */
    @Test
    void testAllArgsConstructor(){
        LocalDate birthdate = LocalDate.of(2000,2, 29);
        Trainee trainee = new Trainee("John", "Doe", birthdate);
        assertEquals("John", trainee.getFirstname(), "firstname");
        assertEquals("Doe", trainee.getLastname(), "lastname");
        assertEquals(birthdate, trainee.getBirthdate(), "birthdate");
    }


    @Test
    void testToString(){
        Trainee trainee = new Trainee("Jane", "Doe", LocalDate.of(2000,2,29));
        assertEquals("Trainee{Jane Doe ; 2000-02-29}", trainee.toString());
    }

}