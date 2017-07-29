package com.johnchang;

public class NoCard implements ATMState {

    ATMMachine = atmMachine;

    public NoCard(ATMMachine newATMMachine) {

        newATMMachine = newATMMachine;
    }

    public void insertCard() {

        System.out.println("Please enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    public void ejectCard() {

        System.out.println("Enter a card first");
    }

    public void insertPin(int pinEntered) {

        System.out.println("Enter a card first");
    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("Enter a card first");
    }
}
