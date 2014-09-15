package com.zirix.android.busaorj.app.graphics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.zirix.android.busaorj.app.SinoticoActivity;


public class AndroidFastRenderView extends SurfaceView implements Runnable , SurfaceHolder.Callback {
    SinoticoActivity game;
    Bitmap framebuffer;
    Thread renderThread = null;
    SurfaceHolder holder;
    volatile boolean running = false;

    public AndroidFastRenderView(SinoticoActivity game, Bitmap framebuffer) {
        super(game);
        this.game = game;
        this.framebuffer = framebuffer;
        this.holder = getHolder();
        this.holder.addCallback(this);

    }

    public void resume() {


    }

    public void run() {
        Rect dstRect = new Rect();
        long startTime = System.nanoTime();
        while(running) {
            if(!holder.getSurface().isValid())
                continue;


            float deltaTime = (System.nanoTime() - startTime) / 10000000.000f;
            startTime = System.nanoTime();

            if (deltaTime > 3.15){
                deltaTime = (float) 3.15;
            }


            game.getCurrentScreen().update(deltaTime);
            game.getCurrentScreen().paint(deltaTime);



            Canvas canvas = holder.lockCanvas();
            canvas.getClipBounds(dstRect);
            canvas.drawBitmap(framebuffer, null, dstRect, null);
            holder.unlockCanvasAndPost(canvas);


        }
    }

    public void pause() {
        running = false;
        while(true) {
            try {
                renderThread.join();
                break;
            } catch (InterruptedException e) {
                // retry
            }

        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

        running = true;
        renderThread = new Thread(this);
        renderThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}