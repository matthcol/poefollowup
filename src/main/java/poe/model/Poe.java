package poe.model;

import java.time.LocalDate;

public class Poe {
    private String title;
    private LocalDate beginDate;
    private LocalDate endDate;
    private PoeType poeType;

    public Poe() {
    }

    public Poe(String title, LocalDate beginDate, LocalDate endDate, PoeType poeType) {
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.poeType = poeType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public PoeType getPoeType() {
        return poeType;
    }

    public void setPoeType(PoeType poeType) {
        this.poeType = poeType;
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
