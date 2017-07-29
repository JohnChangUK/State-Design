package com.johnchang;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

        hasCard = new HasCard(this);
        noCard = new noCard(this);
        hasCorrectPin = new hasCorrectPin(this);
        atmOutOfMoney = new atmOutOfMoney(this);
    }
}

