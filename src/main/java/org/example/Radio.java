package org.example;

public class Radio {
    private int volume;
    private int currentStation;
    private int numberStation = 10;

    public Radio() {

    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }


    public int getVolume() {

        return volume;
    }

    public void setVolume(int newVolume) {  // границы звука
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public void plusVolume() {    //+ звук
        if (volume < 100) {
            setVolume(volume + 1);
        }
    }

    public void minusVolume() {   //- звук
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setStation(int newCurrentStation) {
        if (newCurrentStation > numberStation - 1) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == numberStation - 1) {
            setStation(0);
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setStation(numberStation - 1);
        } else {
            currentStation--;
        }
    }
}
