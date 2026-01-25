package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double salary;

    private List<Contract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.salary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getSalary() {
        return salary;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        contracts.remove(contract);
    }

    public void increaseSalary(int mouth) {
        double newSalary = salary;
        for (Contract contract : contracts) {
            if (contract.getDate().getMonthValue() == mouth) {
                newSalary += contract.contractValue();
            }
        }
        this.salary = newSalary;
    }

    public String toString() {
        return name
                + " "
                + level
                + " $"
                + salary;
    }

}
