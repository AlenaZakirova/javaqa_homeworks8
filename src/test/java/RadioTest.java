import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(44);

        Assertions.assertEquals(44, radio.getSoundVolume());

    }

    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        Assertions.assertEquals(0, radio.getSoundVolume());

    }

    @Test
    public void testVolumePlus() {
        Radio radio = new Radio();

        radio.setSoundVolume(101);

        Assertions.assertEquals(0, radio.getSoundVolume());

    }

    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(99);
        radio.increaseVolume();
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void testStation() {
        Radio radio = new Radio();

        radio.setStation(7);

        Assertions.assertEquals(7, radio.getStation());

    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();

        Assertions.assertEquals(9, radio.getStation());

        radio.nextStation();
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testStationNegative() {
        Radio radio = new Radio();
        radio.setStation(-1);
        Assertions.assertEquals(0, radio.getStation());

        radio.setStation(101);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testPreviousStation() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.previousStation();

        Assertions.assertEquals(0, radio.getStation());

        radio.previousStation();
        Assertions.assertEquals(9, radio.getStation());
    }
}