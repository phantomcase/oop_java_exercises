package com.techreturners.cats;

public abstract class abstractCat implements Cat {
    protected boolean isSleep = false;

    public void DomesticCat(){

    }

    public abstract String getSetting();

    @Override
    public void goToSleep() {
        this.isSleep = true;
    }

    @Override
    public void wakeUp() {
        this.isSleep = false;
    }

    @Override
    public boolean isAsleep() {
        return this.isSleep;
    }

    public abstract int getAverageHeight();

    public abstract String eat();

}
