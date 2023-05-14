package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.plusVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void SetVolume1() {
        Radio radio = new Radio();
        radio.setVolume(1);
        Assertions.assertEquals(1, radio.getVolume());
    }

    @Test
    public void PlusSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.plusVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void MinusSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minusVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void MinusSetVolume1() {
        Radio radio = new Radio();
        radio.setVolume(60);
        radio.minusVolume();
        Assertions.assertEquals(59, radio.getVolume());
    }

    @Test
    public void NegativitySetVolume() {
        Radio radio = new Radio();
        radio.setVolume(1000);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void NegativitySetVolume1() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.nextStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStation1() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStation0() {
        Radio radio = new Radio();
        radio.setStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void setStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void NegativitySetStation1() {
        Radio radio = new Radio(8);
        radio.setStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setStation2() {
        Radio radio = new Radio();
        radio.setStation(-5);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


//
//    @Test
//    public void shouldNegativitySetStation1() {
//        Radio service = new Radio();
//
//        service.setStation(10);
//
//        int expected = 0;
//        int actual = service.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldNegativitySetStation2() {
//        Radio service = new Radio();
//
//        service.setStation(-10);
//
//        int expected = 0;
//        int actual = service.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
}
