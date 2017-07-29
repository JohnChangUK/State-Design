package com.johnchang;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        System.out.println("You can't enter more than One card");
    }

    public void ejectCard() {

    }

    public void insertPin(int pinEntered) {

    }

    public void requestCash(int cashToWithdraw) {

    }
}
