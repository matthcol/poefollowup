package poe.model.play;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import poe.model.Poe;
import poe.model.PoeType;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

class PlayCollectionPoe {

    static List<Poe> poeList;

    @BeforeAll
    static void initData() {
        poeList = List.of(
                Poe.builder()
                        .title("Java Fullstack")
                        .beginDate(LocalDate.of(2022, 10, 24))
                        .endDate(LocalDate.of(2023, 1, 27))
                        .poeType(PoeType.POEI)
                        .build(),
                Poe.builder()
                        .title("Java Fullstack")
                        .beginDate(LocalDate.of(2022, 11, 2))
                        .endDate(LocalDate.of(2023, 2, 3))
                        .poeType(PoeType.POEC)
                        .build(),
                Poe.builder()
                        .title("Consultant Devops")
                        .beginDate(LocalDate.of(2022, 6, 13))
                        .endDate(LocalDate.of(2022, 9, 16))
                        .poeType(PoeType.POEC)
                        .build(),
                Poe.builder()
                        .title("Consultant Cyber Sécurité")
                        .beginDate(LocalDate.of(2021, 9, 13))
                        .endDate(LocalDate.of(2021, 11, 16))
                        .poeType(PoeType.POEI)
                        .build(),
                Poe.builder()
                        .title("Consultant SAP")
                        .beginDate(LocalDate.of(2022, 4, 13))
                        .endDate(LocalDate.of(2022, 8, 16))
                        .poeType(PoeType.POEI)
                        .build(),
                Poe.builder()
                        .title("Consultant BI")
                        .beginDate(LocalDate.of(2022, 9, 24))
                        .endDate(LocalDate.of(2022, 11, 23))
                        .poeType(PoeType.POEI)
                        .build()
                );
    }

    // 1. compter les POEI
    @Test
    void countPOEI() {
        long countPOEI = poeList.stream()
                .filter(poe -> PoeType.POEI.equals((poe.getPoeType())))
                .count();
        System.out.println("Nombre POEI: " + countPOEI);


    }

    // 2. Moyenne de la durée (en jours) des POE
    @Test
    void averageDurationInDays() {
        poeList.stream()
                .skip(1)
                .limit(3)
                .mapToLong(poe -> ChronoUnit.DAYS.between(
                        poe.getBeginDate(),
                        poe.getEndDate()
                ))
                .peek(d -> System.out.println("DEBUG: poe duration = " + d))
                .average()
                .ifPresent(averageDuration -> System.out.println(
                        "La durée moyenne des POE est : "
                        + averageDuration
                        + " jours"
                ));
    }
}
