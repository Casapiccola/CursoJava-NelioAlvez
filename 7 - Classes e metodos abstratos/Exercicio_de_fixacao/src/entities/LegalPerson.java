package entities;

public class LegalPerson extends Person {

    private Integer numEmployees;

    public LegalPerson(){
    }

    public LegalPerson(String name, Double annualIncome, Integer numEmployees) {
        super(name, annualIncome);
        this.numEmployees = numEmployees;
    }

    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public double taxCalculation() {
        if (numEmployees > 10) {
            return getAnnualIncome() * 0.14;
        }
        else {
            return getAnnualIncome() * 0.16;
        }
    }

    @Override
    public String toString() {
        return getName()
                + ": $ "
                + String.format("%.2f", taxCalculation());
    }
}
