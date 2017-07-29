package com.johnchang;

public class HasPin implements ATMState {

    ATMMachine = atmMachine;

    public HasPin(ATMMachine newATMMachine) {

        atmMachine = newATMMachine;
    }

    public void insertCard() {

        System.out.println("You cannot enter more than One card");
    }

    public void ejectCard() {

        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void insertPin(int pinEntered) {

        System.out.println("Already Entered PIN");
    }

    public void requestCash(int cashToWithdraw) {

        if(cashToWithdraw > atmMachine.cashInMachine) {
            System.out.println("Unable to provide ALL that cash");
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + "is provided by the Machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0) {
                atmMachine.setATMMachine(atmMachine.getNoCashState());
            }
        }
    }
}
