package com.example.soundsystem;

import java.util.List;

public class FullDisc implements CompactDisc{
    private String title;
    private String artist;
    private List<String> songs;

    public FullDisc(String title, String artist, List<String> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for(String song: songs) {
            System.out.println("-song: " + song);
        }
    }
}
