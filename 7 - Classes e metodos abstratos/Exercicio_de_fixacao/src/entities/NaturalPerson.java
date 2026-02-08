package entities;

public class NaturalPerson extends Person {

    private Double healthcareExpenses;

    public NaturalPerson(){
    }

    public NaturalPerson(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double taxCalculation() {
        if (getAnnualIncome() >= 20000.00) {
            return (getAnnualIncome() * 0.25) - (healthcareExpenses * 0.50);
        }
        else {
            return (getAnnualIncome() * 0.15) - (healthcareExpenses * 0.50);
        }
    }

    @Override
    public String toString() {
        return getName()
                + ": $ "
                + String.format("%.2f", taxCalculation());
    }
}
