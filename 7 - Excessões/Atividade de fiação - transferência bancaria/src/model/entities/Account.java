package model.entities;

import model.enums.TransferStatus;
import model.exceptions.TransferException;

import static model.enums.TransferStatus.*;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    private TransferStatus status;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        this.status = PENDING;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public TransferStatus getStatus() {
        return status;
    }

    public void setStatus(TransferStatus status) {
        this.status = status;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        validationWithdraw(amount);
        this.balance -= amount;
        this.status = APPROVED;
    }

    public void validationWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            this.status = REJECTED;
            throw new TransferException("Valor do saque é superior ao limite");
        }
        if (amount > getBalance()) {
            this.status = REJECTED;
            throw new TransferException("Valor do saque maior que o saldo da conta");
        }
    }
}
