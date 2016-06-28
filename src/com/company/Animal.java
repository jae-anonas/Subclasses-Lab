package com.company;

/**
 * Created by roosevelt on 6/28/16.
 *
 * Member variables:
 * mNumLegs, mTopSpeed, mIsEndangered, mName
 */
public class Animal {

    private int mNumLegs;
    private int mTopSpeed;
    private String mName;
    private boolean mIsEndangered;

    public Animal(){
        mNumLegs = 2;
        mTopSpeed = 10;
        mName = "unnamed";
        mIsEndangered = false;
    }

    public Animal(int numLegs, int topSpeed, String name, boolean isEndangered){
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mName = name;
        mIsEndangered = isEndangered;
    }
    public int getNumLegs() {
        return mNumLegs;
    }

    public void setNumLegs(int mNumLegs) {
        this.mNumLegs = mNumLegs;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setIsEndangered(boolean mIsEndangered) {
        this.mIsEndangered = mIsEndangered;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int mTopSpeed) {
        this.mTopSpeed = mTopSpeed;
    }



}
