package com.zirix.android.busaorj.app.graphics;

import java.util.List;

import android.view.View.OnTouchListener;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<SingleTouchHandler.TouchEvent> getTouchEvents();
}
