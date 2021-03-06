package com.example.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:soundsystem.xml")
public class CDPlayerTest {

    @Autowired
    MediaPlayer mediaPlayer;

    @Test
    public void testCDPlayer() {
        mediaPlayer.play();
    }
}
