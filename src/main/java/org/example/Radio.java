package org.example;

public class Radio {
    private int currentStation;
    private int volume;


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
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            setStation(0);
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setStation(9);
        } else {
            currentStation--;
        }
    }
}
