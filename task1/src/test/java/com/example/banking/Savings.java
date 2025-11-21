package com.example.banking;

public class Savings {

public class SavingsAccount extends Account {
    public SavingsAccount(double initial) { super(initial); }

    public void addInterest(double rate) {
        balance += balance * rate;
    }
}
}