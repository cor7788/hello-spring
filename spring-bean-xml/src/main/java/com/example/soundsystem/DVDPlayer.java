package com.example.soundsystem;

public class DVDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
