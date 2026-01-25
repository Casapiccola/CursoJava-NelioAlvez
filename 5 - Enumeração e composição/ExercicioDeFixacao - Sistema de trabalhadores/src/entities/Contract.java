package entities;

import java.time.LocalDate;

public class Contract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer quantityHour;

    public Contract() {
    }

    public Contract(LocalDate date, Double valuePerHour, Integer quantityHour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.quantityHour = quantityHour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getQuantityHour() {
        return quantityHour;
    }

    public void setQuantityHour(Integer quantityHour) {
        this.quantityHour = quantityHour;
    }

    public double contractValue() {
        return valuePerHour * quantityHour;
    }

}
