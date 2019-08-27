package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;


public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        Mockito.verify(mockQuest, times(1)).embark();
    }

}
