package com.example;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("勇士，随我去屠龙吧！");
    }
}
