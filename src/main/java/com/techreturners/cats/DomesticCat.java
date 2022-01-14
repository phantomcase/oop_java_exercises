package com.techreturners.cats;

public class DomesticCat extends abstractCat {
    @Override
    public String getSetting() {
        return "domestic";
    }

    @Override
    public int getAverageHeight() {
        return 23;
    }

    @Override
    public String eat() {
       int rand = (int)(Math.random() * 10);
       if(rand<2){
           return "Purrrrrrr! It will do I suppose....";
       }else{
           return "Purrrrrrr";
       }


    }
}
