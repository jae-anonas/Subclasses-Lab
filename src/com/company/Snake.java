package com.company;

/**
 * Created by roosevelt on 6/28/16.
 */
public class Snake extends Reptile {

    private int mLength;

    public Snake(){
        super();
        mLength = 4;
    }

    public Snake(int topSpeed, String name, boolean isEndangered, int length) {
        super(0, topSpeed, name, isEndangered, true); //isEgglaying defaults to true
        mLength = length;
    }

    public Snake(int topSpeed, String name, boolean isEndangered, int length, boolean isEggLaying) {
        super(0, topSpeed, name, isEndangered, isEggLaying);
        mLength = length;
    }


    public int getLength() {
        return mLength;
    }

    public void setLength(int mLength) {
        this.mLength = mLength;
    }


}
