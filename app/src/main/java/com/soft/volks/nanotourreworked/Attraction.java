package com.soft.volks.nanotourreworked;

/**
 * Created by nkarayev on 2/23/17.
 */

import java.io.Serializable;

public class Attraction implements Serializable{

    private String mName;
    private String mAddress;
    private String mDesc;
    private int mThumbId;
    private int mImgId;


    public Attraction() {
        mName = null;
        mAddress = null;
        mDesc = null;
        mThumbId = 0;
        mImgId = 0;
    }



    public int getmThumbId() {
        return mThumbId;
    }

    public void setmThumbId(int mThumbId) {
        this.mThumbId = mThumbId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }


    public int getmImgId() {
        return mImgId;
    }

    public void setmImgId(int mImgId) {
        this.mImgId = mImgId;
    }}
