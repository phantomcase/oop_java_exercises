package com.techreturners.cats;

public class wildCat extends abstractCat{

    @Override
    public String getSetting() {
        return "wild";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
