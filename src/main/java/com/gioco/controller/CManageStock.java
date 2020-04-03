package com.gioco.controller;

public class CManageStock implements IController {
    private int optionSelected;

    public CManageStock(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }


    @Override
    public void controller() {
        switch (optionSelected) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
