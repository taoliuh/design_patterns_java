package com.sonaive.adapter;

/**
 * Created by liutao on 15-7-7.
 */
public class EuroHotel {

    private EuroPlug mPlug;

    public EuroHotel(EuroPlug plug) {
        mPlug = plug;
    }

    public void setPlug(EuroPlug plug) {
        mPlug = plug;
    }

    public void charge() {
        if (mPlug == null) {
            return;
        }
        mPlug.chargeWithTwoPins();
    }

}
