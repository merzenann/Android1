package com.example.merzensumagaysay.mynavigationdrawer;

/**
 * Created by merzensumagaysay on 17/09/2018.
 */

public enum  ModelObject {


    HOME(R.color.white, R.layout.activity_home),
    BASIC1(R.color.white, R.layout.view_basic1);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId)
    {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {return mTitleResId;}

    public int getLayoutResId() {return  mLayoutResId;}
}
