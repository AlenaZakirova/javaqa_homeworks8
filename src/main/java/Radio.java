public class Radio {
    private int thisStation;
    private int soundVolume;


    public int getStation() {
        return thisStation;
    }

    public void setStation(int thisStation) {
        if (thisStation < 0) {
            return;
        }
        if (thisStation > 9) {
            return;
        }
        this.thisStation = thisStation;
    }

    public void nextStation() {
        if (this.thisStation == 9) {
            this.thisStation = 0;
        } else {
            this.thisStation++;
        }
    }

    public void previousStation() {
        if (this.thisStation == 0) {
            this.thisStation = 9;
        } else {
            this.thisStation--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (this.soundVolume < 100) {
            this.soundVolume = this.soundVolume + 1;
        }
    }
}
