package com.jude.prisoner;

import com.jude.Manager;
import com.jude.Prisoner;

/**
 * Created by admin on 2016/10/28.
 */
public class SdSokePrisoner implements Prisoner {


    private Manager manager;
    private int totalPerson;
    private int totalCount;

    @Override
    public String getName() {
        return " 邓丹怡2016212683";
    }

    @Override
    public void begin(Manager manager, int totalPerson, int totalCount) {
        this.manager=manager;
        this.totalPerson=totalPerson;
        this.totalCount=totalCount;

    }

    @Override
    public int take(int index, int last) {
        return 36;
    }

    @Override
    public void result(boolean survived) {

    }
}
