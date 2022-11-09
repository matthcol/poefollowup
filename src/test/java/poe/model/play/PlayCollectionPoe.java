package poe.model.play;

import org.junit.jupiter.api.Test;
import poe.model.Poe;
import poe.model.PoeType;

import java.time.LocalDate;
import java.util.List;

public class PlayCollectionPoe {

    @Test
    void playWithListPoe() {
        List<Poe> poeList = List.of(
                new Poe(
                        "Java Fullstack",
                        LocalDate.of(2022,10,24),
                        LocalDate.of(2023,1,27),
                        PoeType.POEI
                ),
                new Poe(
                        "Java Fullstack",
                        LocalDate.of(2022,11,2),
                        LocalDate.of(2023,2,3),
                        PoeType.POEC
                ),
                new Poe(
                        "Consultant Devops",
                        LocalDate.of(2022,6,13),
                        LocalDate.of(2023,9,16),
                        PoeType.POEC
                ),
                new Poe(
                        "Consultant Cyber Sécurité",
                        LocalDate.of(2021,9,13),
                        LocalDate.of(2021,11,16),
                        PoeType.POEI
                ),
                new Poe(
                        "Consultant SAP",
                        LocalDate.of(2022,4,13),
                        LocalDate.of(2022,8,16),
                        PoeType.POEI
                ),
                new Poe(
                        "Consultant BI",
                        LocalDate.of(2022,9,24),
                        LocalDate.of(2022,11,23),
                        PoeType.POEI
                )
        );
        System.out.println(poeList);
    }
}
