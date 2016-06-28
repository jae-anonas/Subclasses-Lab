package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Lizard extends Reptile {
    private boolean mCanStickOnWalls;

    public Lizard(){
        super();
        mCanStickOnWalls = false;
    }


    public Lizard(int numLegs, int topSpeed, String name, boolean isEndangered, int length) {
        super(numLegs, topSpeed, name, isEndangered, true); //isEgglaying defaults to true
        mCanStickOnWalls = false;
    }

    public Lizard(int topSpeed, String name, boolean isEndangered, boolean isEggLaying, boolean canStick) {
        super(0, topSpeed, name, isEndangered, isEggLaying);
        mCanStickOnWalls = canStick;
    }

    public boolean canStickOnWalls(){
        return mCanStickOnWalls;
    }

}
