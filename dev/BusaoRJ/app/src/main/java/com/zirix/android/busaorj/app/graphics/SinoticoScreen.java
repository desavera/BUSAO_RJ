package com.zirix.android.busaorj.app.graphics;

/**
 * Created by mvera on 11/09/14.
 */
import java.util.List;
import java.util.Vector;

import android.graphics.Color;
import android.graphics.Paint;

import com.zirix.android.busaorj.app.SinoticoActivity;


public class SinoticoScreen extends Screen {

    enum SinoticoState {
        Ready, Running, Paused, GameOver
    }

    public static int X_POS = 40;
    public static int Y_POS = 0;
    public static int Y_POS_LOOP = 200;
    public static int Y_POS_LOOP_COUNT = 0;
    public static int PONTO_RECT_SIZE = 15;
    public static int PONTO_STRING_SIZE = 35;


    SinoticoState state = SinoticoState.Ready;

    // Variable Setup
    // You would create game objects here.

    int livesLeft = 1;
    Paint paint;

    public SinoticoScreen(SinoticoActivity game) {
        super(game);

        // Initialize game objects here

        // Defining a paint object
        paint = new Paint();
        paint.setTextSize(30);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
    }

    @Override
    public void update(float deltaTime) {
        //List<SingleTouchHandler.TouchEvent> touchEvents = game.getInput().getTouchEvents();

        List<SingleTouchHandler.TouchEvent> touchEvents = new Vector<SingleTouchHandler.TouchEvent>();


        // We have four separate update methods in this example.
        // Depending on the state of the game, we call different update methods.
        // Refer to Unit 3's code. We did a similar thing without separating the
        // update methods.

        if (state == SinoticoState.Ready)
            updateReady(touchEvents);
        if (state == SinoticoState.Running)
            updateRunning(touchEvents, deltaTime);
        if (state == SinoticoState.Paused)
            updatePaused(touchEvents);
        if (state == SinoticoState.GameOver)
            updateGameOver(touchEvents);
    }

    private void updateReady(List<SingleTouchHandler.TouchEvent> touchEvents) {

        // This example starts with a "Ready" screen.
        // When the user touches the screen, the game begins. 
        // state now becomes SinoticoState.Running.
        // Now the updateRunning() method will be called!

        //if (touchEvents.size() > 0)
            state = SinoticoState.Running;
    }

    private void updateRunning(List<SingleTouchHandler.TouchEvent> touchEvents, float deltaTime) {

        //This is identical to the update() method from our Unit 2/3 game.


        // 1. All touch input is handled here:
        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            SingleTouchHandler.TouchEvent event = touchEvents.get(i);

            if (event.type == SingleTouchHandler.TouchEvent.TOUCH_DOWN) {

                if (event.x < 640) {
                    // Move left.
                }

                else if (event.x > 640) {
                    // Move right.
                }

            }

            if (event.type == SingleTouchHandler.TouchEvent.TOUCH_UP) {

                if (event.x < 640) {
                    // Stop moving left.
                }

                else if (event.x > 640) {
                    // Stop moving right. }
                }
            }


        }

        // 2. Check miscellaneous events like death:

        if (livesLeft == 0) {
            state = SinoticoState.GameOver;
        }


        // 3. Call individual update() methods here.
        // This is where all the game updates happen.
        // For example, robot.update();
    }

    private void updatePaused(List<SingleTouchHandler.TouchEvent> touchEvents) {
        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            SingleTouchHandler.TouchEvent event = touchEvents.get(i);
            if (event.type == SingleTouchHandler.TouchEvent.TOUCH_UP) {

            }
        }
    }

    private void updateGameOver(List<SingleTouchHandler.TouchEvent> touchEvents) {
        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            SingleTouchHandler.TouchEvent event = touchEvents.get(i);
            if (event.type == SingleTouchHandler.TouchEvent.TOUCH_UP) {
                if (event.x > 300 && event.x < 980 && event.y > 100
                        && event.y < 500) {
                    nullify();
                    game.setScreen(new SinoticoScreen(game));
                    return;
                }
            }
        }

    }

    @Override
    public void paint(float deltaTime) {
        AndroidGraphics g = game.getGraphics();

        // First draw the game elements.

        // Example:
        // g.drawImage(Assets.background, 0, 0);
        // g.drawImage(Assets.character, characterX, characterY);

        // Secondly, draw the UI above the game elements.
        if (state == SinoticoState.Ready)
            drawReadyUI();
        if (state == SinoticoState.Running)
            drawRunningUI();
        if (state == SinoticoState.Paused)
            drawPausedUI();
        if (state == SinoticoState.GameOver)
            drawGameOverUI();

    }

    private void nullify() {

        // Set all variables to null. You will be recreating them in the
        // constructor.
        paint = null;

        // Call garbage collector to clean up memory.
        System.gc();
    }

    private void drawReadyUI() {
        AndroidGraphics g = game.getGraphics();
        //g.drawRect(0, 0, 1281, 801, Color.WHITE);
        g.drawARGB(155, 255, 255, 255);
        g.drawString("Tap each side of the screen to move in that direction.",
                640, 300, paint);

    }

    private void drawRunningUI() {
        AndroidGraphics g = game.getGraphics();

        g.drawRect(0, 0, 801, 1281, Color.WHITE);
        g.drawLine(40, 10, 40, 1281, Color.BLACK);

        Paint proxPontoPaint = new Paint();
        proxPontoPaint.setStrokeWidth(3.5f);
        proxPontoPaint.setTextSize(2.0f);

        Paint p = new Paint();
        p.setTextSize(PONTO_STRING_SIZE);

        g.drawString("  Ponto mais próximo..." , 40,40,p);

        AndroidImage busImage1 = g.newImage("ic_bus-web.png", AndroidGraphics.ImageFormat.RGB565);

        g.drawImage(busImage1,X_POS,(Y_POS_LOOP_COUNT) + 200);
        g.drawImage(busImage1,X_POS,(Y_POS_LOOP_COUNT) + 400);
        g.drawImage(busImage1,X_POS,(Y_POS_LOOP_COUNT) + 600);
        g.drawImage(busImage1,X_POS,(Y_POS_LOOP_COUNT) + 800);


        Y_POS_LOOP_COUNT++;

        g.drawRect(X_POS,200,PONTO_RECT_SIZE,PONTO_RECT_SIZE,Color.BLUE);
        g.drawRect(X_POS,400,PONTO_RECT_SIZE,PONTO_RECT_SIZE,Color.BLUE);
        g.drawRect(X_POS,600,PONTO_RECT_SIZE,PONTO_RECT_SIZE,Color.BLUE);
        g.drawRect(X_POS,800,PONTO_RECT_SIZE,PONTO_RECT_SIZE,Color.BLUE);

        g.drawString("  82141" ,X_POS + 10,200,p);
        g.drawString("  82142" ,X_POS + 10,400,p);
        g.drawString("  82143" ,X_POS + 10,600,p);
        g.drawString("  82144" ,X_POS + 10,800,p);
    }

    private void drawPausedUI() {
        AndroidGraphics g = game.getGraphics();
        // Darken the entire screen so you can display the Paused screen.
        g.drawARGB(155, 0, 0, 0);

    }

    private void drawGameOverUI() {
        AndroidGraphics g = game.getGraphics();
        g.drawRect(0, 0, 1281, 801, Color.BLACK);
        g.drawString("GAME OVER.", 640, 300, paint);
    }

    @Override
    public void pause() {
        if (state == SinoticoState.Running)
            state = SinoticoState.Paused;

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {
        pause();
    }
}