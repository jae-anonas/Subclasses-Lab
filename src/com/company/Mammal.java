package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Mammal extends Animal {

    private int mHairPerSqInch;

    public Mammal(){
        super();
        mHairPerSqInch = 200;
    }

    public Mammal(int numLegs, int topSpeed, String name, boolean isEndangered, int hairPerSqInch) {
        super(numLegs, topSpeed, name, isEndangered);
        mHairPerSqInch = hairPerSqInch;
    }


    public int getHairPerSqInch() {
        return mHairPerSqInch;
    }

    public void setHairPerSqInch(int mHairPerSqInch) {
        this.mHairPerSqInch = mHairPerSqInch;
    }

}
