package com.ohashi.test;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Sample00 {
    public static class A {
        public void run() {
            System.out.println("A#run() is called.");
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        A a = injector.getInstance(A.class);
        a.run();
    }
}