package domain.entities;

import domain.exceptions.DomainException;

public class Account {
    Integer number;
    String name;
    Double balance;
    Double withDrawLimit;

    public Account() {

    }

    public Account(Integer number, String name, Double balance, Double withDrawLimit) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > withDrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (balance < amount) {
            throw new DomainException("Not enough balance");
        }
        this.balance -= amount;
    }

}
