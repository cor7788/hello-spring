package com.example.config;

import com.example.soundsystem.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.Random;

@Configuration
@PropertySource(value = "classpath:app.properties", encoding = "utf-8")
public class CDPlayerConfig {

    private Environment env;

    @Autowired
    public CDPlayerConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public CompactDisc randomCD() {
        int choice = (int) Math.floor(Math.random() * 2);
        // Random random = new Random();
        // int choice = random.nextInt(2);

        if (choice == 0) {
            return new SgtPeppers();
        } else {
            return new WhiteAlbum();
        }
    }

    @Bean
    @Primary
    public CompactDisc blankDisc() {
        return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }

    // 这种方式需要知道另一个 bean 的函数名。
//    @Bean
//    public MediaPlayer mediaPlayer() {
//        return new CDPlayer(randomCD());
//    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd) {
        // 使用构造器或者 setter
//        CDPlayer cdPlayer = new CDPlayer();
//        cdPlayer.setCompactDisc(cd);
//        return cdPlayer;
        return new CDPlayer(cd);
    }
}
