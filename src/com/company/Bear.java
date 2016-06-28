package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Bear extends Mammal {
    private boolean mIsPolar;


    public Bear(){
        super();
        mIsPolar = false;
    }

    public Bear(int numLegs, int topSpeed, String name, int hairPerSquareInch, boolean isEndangered, boolean isPolar) {
        super(numLegs, topSpeed, name, isEndangered, hairPerSquareInch);
        mIsPolar = isPolar;
    }

    public boolean isPolar(){
        return mIsPolar;
    }


}
