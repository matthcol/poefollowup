package poe.model.play;

import org.junit.jupiter.api.Test;
import poe.model.Trainee;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PlayWithTrainee {

    /**
     * this is not a unit test
     */
    @Test
    void playWithTrainee(){
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
    void playWithSeveralInstances(){
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        System.out.println(trainee1);
        System.out.println(trainee2);
    }

}
