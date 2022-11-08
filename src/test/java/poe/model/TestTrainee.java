package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrainee {

    @Test
    void testDefaultConstructor(){
        Trainee trainee = new Trainee();
        System.out.println(trainee);
        System.out.println(trainee.hashCode());
        System.out.println(trainee.getFirstname());
        // call a method on null: NullPointerException
        // System.out.println(trainee.getFirstname().toUpperCase());
        trainee.setFirstname("John");
        System.out.println(trainee.getFirstname());
    }

    @Test
    void testAllArgsConstructor(){
        LocalDate birthdate = LocalDate.of(2000,2, 29);
        Trainee trainee = new Trainee("John", "Doe", birthdate);
        assertEquals("Jhnon", trainee.getFirstname(), "firstname");
        assertEquals("Doe", trainee.getLastname(), "lastname");
        assertEquals(birthdate, trainee.getBirthdate(), "birthdate");
    }

    @Test
    void severalInstances(){
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        System.out.println(trainee1);
        System.out.println(trainee2);
    }

    @Test
    void testToString(){
        Trainee trainee = new Trainee("Jane", "Doe", LocalDate.of(2000,2,29));
        System.out.println(trainee.toString());
    }

}