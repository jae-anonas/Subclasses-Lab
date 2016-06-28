package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Reptile extends Animal {

    private boolean mIsEggLaying;

    public Reptile(){
        super();
        mIsEggLaying = true; //defaults to true
    }

    public Reptile(int numLegs, int topSpeed, String name, boolean isEndangered, boolean isEggLaying) {
        super(numLegs, topSpeed, name, isEndangered);
        mIsEggLaying = isEggLaying;
    }

    public boolean isEggLaying() {
        return mIsEggLaying;
    }

    public void setIsEggLaying(boolean mIsEggLaying) {
        this.mIsEggLaying = mIsEggLaying;
    }
}
