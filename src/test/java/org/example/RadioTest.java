package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio service = new Radio();

        service.setVolume(100);
        service.plusVolume();

        int expected = 100;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio service = new Radio();

        service.setVolume(1);

        int expected = 1;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusSetVolume() {
        Radio service = new Radio();

        service.setVolume(99);
        service.plusVolume();

        int expected = 100;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusSetVolume() {
        Radio service = new Radio();

        service.setVolume(0);
        service.minusVolume();

        int expected = 0;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusSetVolume1() {
        Radio service = new Radio();

        service.setVolume(50);
        service.minusVolume();

        int expected = 49;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio service = new Radio();

        service.setStation(5);

        int expected = 5;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation1() {
        Radio service = new Radio();

        service.setStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation2() {
        Radio service = new Radio();

        service.setStation(1);
        service.nextStation();

        int expected = 2;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation0() {
        Radio service = new Radio();

        service.setStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation1() {
        Radio service = new Radio();

        service.setStation(5);
        service.prevStation();

        int expected = 4;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativitySetVolume1() {
        Radio service = new Radio();

        service.setVolume(1000);

        int expected = 0;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativitySetVolume2() {
        Radio service = new Radio();

        service.setVolume(-1);

        int expected = 0;
        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativitySetStation1() {
        Radio service = new Radio();

        service.setStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNegativitySetStation2() {
        Radio service = new Radio();

        service.setStation(-10);

        int expected = 0;
        int actual = service.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
