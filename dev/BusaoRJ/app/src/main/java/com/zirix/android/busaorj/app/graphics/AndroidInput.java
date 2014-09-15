package com.zirix.android.busaorj.app.graphics;

import java.util.List;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;



public class AndroidInput {
    TouchHandler touchHandler;

    public AndroidInput(Context context, View view, float scaleX, float scaleY) {

       touchHandler = new SingleTouchHandler(view, scaleX, scaleY);

    }



    public boolean isTouchDown(int pointer) {
        return touchHandler.isTouchDown(pointer);
    }


    public int getTouchX(int pointer) {
        return touchHandler.getTouchX(pointer);
    }


    public int getTouchY(int pointer) {
        return touchHandler.getTouchY(pointer);
    }




    public List<SingleTouchHandler.TouchEvent> getTouchEvents() {
        return touchHandler.getTouchEvents();
    }

}