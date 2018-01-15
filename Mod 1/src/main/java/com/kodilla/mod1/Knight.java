package com.kodilla.mod1;
import com.kodilla.mod1.DeadIslandQ;
import com.kodilla.mod1.EliteKnightQ;


public class Knight {
    private Quest quest;
    public Knight (Quest quest){
        this.quest = quest;
    }
    public void doQuest(){
        this.quest.process();
        System.out.println("Done");
    }

}
