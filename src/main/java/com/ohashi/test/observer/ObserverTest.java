package com.ohashi.test.observer;

/**
 * Created by ohashi on 2017/02/16.
 */
public class ObserverTest {
    public static void main(String[] args){
        ObservableMan observableMan = new ObservableMan();

// 観察者を2名追加
        observableMan.addObserver(new ObserverA());
        observableMan.addObserver(new ObserverB());

// 観察者全員に通知
        observableMan.notifyObservers("xxx");
    }
}
