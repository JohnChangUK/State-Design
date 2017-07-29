package com.johnchang;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {

        atmMachine = newATMMachine;
    }

    public void insertCard() {

        System.out.println("Currently do not have any Money");
    }

    public void ejectCard() {

        System.out.println("No Money available, Card not Entered");
    }

    public void insertPin(int pinEntered) {

        System.out.println("Do not have money available");
    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("No Money Available");
    }
}
