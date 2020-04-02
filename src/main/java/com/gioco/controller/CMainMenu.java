package com.gioco.controller;

public class CMainMenu implements IController{
    private int optionSelected;

    public CMainMenu(int option) {
        this.optionSelected = option;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public void controller() {
        switch (optionSelected) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
