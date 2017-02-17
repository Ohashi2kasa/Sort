package com.ohashi.test.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ohashi on 2017/02/16.
 */
public class ObserverB implements Observer {
    public void update(Observable o, Object arg) {
        String str = (String) arg;
        System.out.println("わいはBや。観察対象の通知を検知したでぇ。" + str);
    }

}

