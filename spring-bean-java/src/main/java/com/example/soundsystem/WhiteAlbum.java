package com.example.soundsystem;

public class WhiteAlbum implements CompactDisc {

    private String title = "White Album";
    private String artist = "White Album's Author";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
