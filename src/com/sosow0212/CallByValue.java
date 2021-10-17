package com.sosow0212;

class Updater {
    public void update(CallByValue counter) {
        counter.count++;
    }
}

public class CallByValue {

    int count = 0;

    public static void main(String[] args) {
        CallByValue myCounter = new CallByValue();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
