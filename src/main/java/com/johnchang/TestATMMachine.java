package com.johnchang;

public class TestATMMachine {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(2345);

        atmMachine.requestCash(2000);

        atmMachine.insertCard();

        atmMachine.insertPin(2345);
    }
}
