package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Marsupial extends Mammal{

    private boolean mHasPouch;

    public Marsupial(){
        super();
        mHasPouch = true;
    }

    public Marsupial(int numLegs, int topSpeed, String name, int hairPerSquareInch, boolean isEndangered, boolean hasPouch) {
        super(numLegs, topSpeed, name, isEndangered, hairPerSquareInch);
        mHasPouch = hasPouch;
    }

    public boolean hasPouch() {
        return mHasPouch;
    }

    public void setHasPouch(boolean mHasPouch) {
        this.mHasPouch = mHasPouch;
    }
}
