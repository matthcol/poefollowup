package poe.model;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Poe {
    private String title;
    private LocalDate beginDate;
    private LocalDate endDate;
    private PoeType poeType;

    @Builder.Default
    private List<Trainee> trainees = new ArrayList<>();

    public void addTrainee(Trainee trainee) {
        trainees.add(trainee);
    }

    public void addTrainees(Collection<? extends Trainee> otherTrainees) {
        trainees.addAll(otherTrainees);
    }

    public void addTrainees(Trainee... otherTrainees) {
//        for (Trainee trainee: otherTrainees) {
//            trainees.add(trainee);
//        }
        Collections.addAll(trainees, otherTrainees);
    }


    @Override
    public String toString() {
        return "Poe{" +
                "title='" + title + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", poeType=" + poeType +
                '}';
    }

}











