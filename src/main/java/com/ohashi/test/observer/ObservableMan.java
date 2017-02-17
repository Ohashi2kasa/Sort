package com.ohashi.test.observer;

import java.util.Observable;

/**
 * Created by ohashi on 2017/02/16.
 */
public class ObservableMan extends Observable {
    // 直前に与えられた引数
    private String previousArg = null;

    /**
     * 観察者に通知します。
     * @param
     */
    public void notifyObservers(Object arg) {
        String str = (String) arg;

// 直前に与えられた引数と同じならそのままリターン
        if (str.equals(previousArg)) {
            return;
        }
            previousArg = str;

            setChanged();

// 通知
            super.notifyObservers(str);

            clearChanged();

        }
}
